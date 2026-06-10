package com.kevin.factory.abstrct.factorires;

import com.kevin.factory.abstrct.products.Dreadnought;
import com.kevin.factory.abstrct.products.SpaceMarine;

public interface BattleBarge { // Factory Interface
     SpaceMarine createSpaceMarine(String name);
     Dreadnought createDreadnought(String name);

}
