package com.kevin;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomValue= random.nextInt(3);
        System.out.println("randomValue = " + randomValue);
    }
}