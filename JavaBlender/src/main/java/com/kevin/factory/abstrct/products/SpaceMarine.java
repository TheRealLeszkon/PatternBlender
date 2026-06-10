package com.kevin.factory.abstrct.products;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class SpaceMarine {
    protected String name;
    protected String meleeWeapon;
    protected final static String[] meleeWeapons = {"PowerSword","ChainSword","ThunderHammer"};
    protected final static Map<String,String> strikeMessages = Map.of(
            "PowerSword","The Marine Slices through the armor of the Traitors gracefully!",
            "ChainSword","The ChainSword Bites into the uncouth and tries to rip apart!",
            "ThunderHammer","The Marine charges and deals a devastating blow!"
    );
    protected final static Random random = new Random();
    public SpaceMarine(String name){
        this.name =name;
        this.meleeWeapon=meleeWeapons[random.nextInt(meleeWeapons.length)];
    }

    protected SpaceMarine(String name,String[] weaponPool){
        this.name=name;
        this.meleeWeapon=weaponPool[random.nextInt(weaponPool.length)];
    }

    public abstract void meleeCombat();
    public abstract void rangedCombat();
}
