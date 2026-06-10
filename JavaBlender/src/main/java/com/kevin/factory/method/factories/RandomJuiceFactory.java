package com.kevin.factory.method.factories;

import com.kevin.factory.method.products.Juice;
import com.kevin.factory.method.products.LemonJuice;
import com.kevin.factory.method.products.OrangeJuice;
import com.kevin.factory.method.products.PineappleJuice;

import java.util.Random;

public class RandomJuiceFactory implements JuiceFactory{
    @Override
    public Juice makeJuice() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        Juice selectedJuice = switch (randomNumber){
            case 0 ->new LemonJuice();
            case 1 ->new OrangeJuice();
            case 2 ->new PineappleJuice();
            default -> null;
        };
        return selectedJuice;
    }
}
