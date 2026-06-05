package com.kevin.factory.simple;

public class B2Droid extends Droid {
    public B2Droid() {
        super("B2 Super Battle Droid", "Arm Cannon");
    }

    @Override
    public void deploy() {
        System.out.println(name + " clanks heavily to life!");
    }

    @Override
    public void attack() {
        System.out.println(name + " blasts with its " + weapon + "!");
    }
}