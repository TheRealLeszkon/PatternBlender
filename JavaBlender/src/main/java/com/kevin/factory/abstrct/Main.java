package com.kevin.factory.abstrct;

import com.kevin.factory.abstrct.factorires.BattleBarge;
import com.kevin.factory.abstrct.factorires.ChaosBattleBarge;
import com.kevin.factory.abstrct.factorires.ImperialBattleBarge;
import com.kevin.factory.abstrct.products.Dreadnought;
import com.kevin.factory.abstrct.products.LoyalistSpaceMarine;
import com.kevin.factory.abstrct.products.SpaceMarine;

public class Main {
    public static void main(String[] args) {
        BattleBarge loyalBattleBarge = new ImperialBattleBarge();
        BattleBarge chaosBattleBarge = new ChaosBattleBarge();
        SpaceMarine loyalistSpaceMarine =loyalBattleBarge.createSpaceMarine("Sigusmund");
        Dreadnought loyalistDreadnought = loyalBattleBarge.createDreadnought("Rylanor The Ancient Of Rights");
        SpaceMarine chaosSpaceMarine = chaosBattleBarge.createSpaceMarine("Kharn The Betrayer");
        Dreadnought chaosDreadnought = chaosBattleBarge.createDreadnought("Mortis Metalikus");

        loyalistSpaceMarine.meleeCombat();
        chaosSpaceMarine.meleeCombat();
        loyalistDreadnought.selfDestruct();
        chaosDreadnought.selfDestruct();


    }
}
