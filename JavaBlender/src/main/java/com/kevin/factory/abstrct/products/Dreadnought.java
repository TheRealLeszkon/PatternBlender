package com.kevin.factory.abstrct.products;

public abstract class Dreadnought extends SpaceMarine {
    public Dreadnought(String name) {
        super(name);

    }

    public abstract void advancedWarfare();
    public abstract void selfDestruct();
}
