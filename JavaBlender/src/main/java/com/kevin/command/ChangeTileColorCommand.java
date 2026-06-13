package com.kevin.command;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class ChangeTileColorCommand implements Command{



    private JButton tile;
    private Color color;

    private Color oldColor;
    public ChangeTileColorCommand(JButton tile,Color color) {
        this.tile = tile;
        this.oldColor=tile.getBackground();
        this.color = color;
    }

    @Override
    public void execute() {
        this.tile.setBackground(this.color);
    }

    @Override
    public void unexecute() {
        this.tile.setBackground(this.oldColor);
    }
}
