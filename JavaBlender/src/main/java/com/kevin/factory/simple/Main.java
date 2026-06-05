package com.kevin.factory.simple;

import static com.kevin.factory.simple.DroidType.B1;
import static com.kevin.factory.simple.DroidType.B2;

public class Main {
    public static void main(String[] args) {
        SimpleDroidFactory factory = new SimpleDroidFactory();
        Droid droid1 = factory.createDroid(B1);
        Droid droid2 = factory.createDroid(B2);

        droid1.deploy();
        droid1.attack();

        droid2.deploy();
        droid2.attack();
    }
}