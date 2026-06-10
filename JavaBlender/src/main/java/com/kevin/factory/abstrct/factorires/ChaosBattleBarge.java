package com.kevin.factory.abstrct.factorires;

import com.kevin.factory.abstrct.products.ChaosSpaceMarine;
import com.kevin.factory.abstrct.products.Dreadnought;
import com.kevin.factory.abstrct.products.HellBrute;
import com.kevin.factory.abstrct.products.SpaceMarine;

public class ChaosBattleBarge implements BattleBarge{
    @Override
    public SpaceMarine createSpaceMarine(String name) {
        return new ChaosSpaceMarine(name);
    }

    @Override
    public Dreadnought createDreadnought(String name) {
        return new HellBrute(name);
    }
}
