package com.kevin.factory.abstrct.products;

import java.util.HashMap;
import java.util.Map;

public class ChaosSpaceMarine extends SpaceMarine{

    private static final String[] chaosWeapons = {"PowerSword","ChainSword","ThunderHammer","ChainAxe","DemonSword"};
    private static final Map<String,String> chaosStrikeMessages = new HashMap<>(strikeMessages);

    static {
        chaosStrikeMessages.put("ChainAxe","His ChainAxe strikes hard and grinds through bones of its victim...");
        chaosStrikeMessages.put("DemonSword","The Demon of his blade empowers his blows with malice..");
    }
    public ChaosSpaceMarine(String name) {
        super(name,chaosWeapons);
    }

    @Override
    public void meleeCombat() {
        System.out.printf("Traitor %s : %s\n",this.name,chaosStrikeMessages.get(this.meleeWeapon));
    }

    @Override
    public void rangedCombat() {
        System.out.println("The Traitor unloads his weapon with absolute hatred");
    }
}
