package com.kevin.factory.method.factories;

import com.kevin.factory.method.products.Juice;
import com.kevin.factory.method.products.LemonJuice;
import com.kevin.factory.method.products.OrangeJuice;
import com.kevin.factory.method.products.PineappleJuice;

import java.util.Random;

public class BalancedJuiceFactory implements JuiceFactory{

    private static int juiceTypeCounter=0;
    @Override
    public Juice makeJuice() {
        juiceTypeCounter=(juiceTypeCounter+1)%3;
        Juice selectedJuice = switch (juiceTypeCounter){
            case 0 ->new LemonJuice();
            case 1 ->new OrangeJuice();
            case 2 ->new PineappleJuice();
            default -> null;
        };
        return selectedJuice;
    }
}
