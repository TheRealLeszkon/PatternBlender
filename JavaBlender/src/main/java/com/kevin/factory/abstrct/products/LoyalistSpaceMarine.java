package com.kevin.factory.abstrct.products;

import java.util.Random;

public class LoyalistSpaceMarine extends SpaceMarine {


    public LoyalistSpaceMarine(String name) {
        super(name);

    }

    @Override
    public void meleeCombat() {
        System.out.printf("Loyalist %s : %s\n",this.name,strikeMessages.get(this.meleeWeapon));
    }

    @Override
    public void rangedCombat() {
        System.out.printf("Loyalist %s : Fires his Bolter with precision.\n",this.name);
    }
}
