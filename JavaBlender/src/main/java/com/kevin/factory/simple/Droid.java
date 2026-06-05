package com.kevin.factory.simple;

public abstract class Droid {
    protected final String name;
    protected final String weapon;

    public Droid(String name, String weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public abstract void deploy();
    public abstract void attack();
}