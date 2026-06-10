package com.kevin.factory.abstrct.factorires;

import com.kevin.factory.abstrct.products.Dreadnought;
import com.kevin.factory.abstrct.products.LoyalistDreadnought;
import com.kevin.factory.abstrct.products.LoyalistSpaceMarine;
import com.kevin.factory.abstrct.products.SpaceMarine;

public class ImperialBattleBarge implements BattleBarge{

    @Override
    public SpaceMarine createSpaceMarine(String name) {
        return new LoyalistSpaceMarine(name);
    }

    @Override
    public Dreadnought createDreadnought(String name) {
        return new LoyalistDreadnought(name);
    }
}
