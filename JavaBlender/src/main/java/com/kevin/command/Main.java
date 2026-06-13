package com.kevin.command;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Main {
    static Color GRASS = new Color(39, 131, 63);
    static Color WATER = new Color(51, 51, 255);
    static Color LAND  = new Color(255, 188, 0);

    private static String selectedFillTile = "Void";
    private static Map<String,Color> tileColorMap = Map.of(
            "Void",Color.BLACK,
            "Land",LAND,
            "Grass",GRASS,
            "Water",WATER
    );

    public static void main(String[] args) {

        ColorCommandInvoker commandInvoker = new ColorCommandInvoker();


        JFrame frame =new JFrame("Tile Placer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);


        // Grid Panel Setup
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(4, 4, 0, 0));

        JButton[] tiles = new JButton[16];
        for (int i = 0; i < 16; i++) {
            JButton tile = new JButton();
            tile.setBackground(Color.BLACK);
            tile.setOpaque(true);
            tile.setBorderPainted(false);
            tile.setFocusPainted(false);
            tiles[i]=tile;
            tile.addActionListener(e->{
                commandInvoker.executeCommand(new ChangeTileColorCommand(tile,tileColorMap.get(selectedFillTile)));
            });
            tile.setFocusable(false);
            gridPanel.add(tile);
        }
        frame.add(gridPanel);

        // Tool Bar setup
        JToolBar toolbar = new JToolBar();
        JLabel selectedFillText = new JLabel("Nothing Selected!");
        JButton landFillButton =new JButton("Land");
        landFillButton.addActionListener(e->{
            selectedFillTile = "Land";
            selectedFillText.setText("Land");
        });
        JButton grassFillButton = new JButton("Grass");
        grassFillButton.addActionListener(e ->{
            selectedFillTile= "Grass";
            selectedFillText.setText("Grass");
        });
        JButton waterFillButton = new JButton("Water");
        waterFillButton.addActionListener(e->{
            selectedFillTile ="Water";
            selectedFillText.setText("Water");
        });

        landFillButton.setFocusable(false);
        grassFillButton.setFocusable(false);
        waterFillButton.setFocusable(false);

        toolbar.add(landFillButton);
        toolbar.add(grassFillButton);
        toolbar.add(waterFillButton);
        toolbar.add(selectedFillText);
        frame.add(toolbar, BorderLayout.NORTH);

        // Getting Keyboard Input
        Set<Integer> pressedKeys = new HashSet<>();
        frame.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                pressedKeys.add(e.getKeyCode());
                System.out.println(pressedKeys);
                if (pressedKeys.contains(KeyEvent.VK_META) && pressedKeys.contains(KeyEvent.VK_Z)) {
                    System.out.println("Pressed Undo!");
                    commandInvoker.unexecuteCommand();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                pressedKeys.remove(e.getKeyCode());
            }
        });


        System.out.println("App Started!");
        frame.setVisible(true);
        frame.requestFocusInWindow();
    }


}
