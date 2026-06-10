package com.kevin.factory.abstrct.products;

public class LoyalistDreadnought extends Dreadnought{
    public LoyalistDreadnought(String name) {
        super(name);
    }

    @Override
    public void advancedWarfare() {
        System.out.println(this.name+" : The Loyalist Dreadnought applies its Laser Cannons and Missiles in a Devastating display.");
    }

    @Override
    public void selfDestruct() {
        System.out.println(this.name+" : The Dreadnought overloads its reactor and Hails the Emperor before its glorious demise.");
    }

    @Override
    public void meleeCombat() {
        System.out.println(this.name+" : The Dreadnought brings down a brutal swing on its unfortunate victims.");
    }

    @Override
    public void rangedCombat() {
        System.out.println(this.name +" : The Dreadnought launches its Missiles at its target.");
    }
}
