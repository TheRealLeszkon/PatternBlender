package com.kevin.factory.simple;

public class B1Droid extends Droid {
    public B1Droid() {
        super("B1 Battle Droid", "Standard Blaster");
    }

    @Override
    public void deploy() {
        System.out.println(name + " unfolds and powers up!");
    }

    @Override
    public void attack() {
        System.out.println(name + " charges in a swarm, firing its " + weapon + "!");
    }
}