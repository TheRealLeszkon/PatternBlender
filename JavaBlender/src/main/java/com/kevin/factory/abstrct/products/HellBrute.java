package com.kevin.factory.abstrct.products;

public class HellBrute extends Dreadnought{
    public HellBrute(String name) {
        super(name);
    }

    @Override
    public void advancedWarfare() {
        System.out.println(this.name+" : The HellBrute warps around the battle field");
    }

    @Override
     public void selfDestruct() {
        System.out.println(this.name +" : The HellBrute fills up with warp energy and destructs into chaos!");
    }

    @Override
    public void meleeCombat() {
        System.out.println(this.name+" : The Brute lumbers and goes berserk on its victims.");
    }

    @Override
    public void rangedCombat() {
        System.out.println(this.name+" : The Brute Hurls a BOULDER at its target!!");
    }
}
