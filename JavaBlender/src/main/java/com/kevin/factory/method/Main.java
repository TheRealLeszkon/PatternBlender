package com.kevin.factory.method;

import com.kevin.factory.method.factories.BalancedJuiceFactory;
import com.kevin.factory.method.factories.JuiceFactory;
import com.kevin.factory.method.factories.RandomJuiceFactory;

public class Main {
    public static void main(String[] args) {
        JuiceFactory balancedJuiceBar = new BalancedJuiceFactory();
        JuiceFactory randomJuiceBar = new RandomJuiceFactory();

        System.out.println("==============================");
        System.out.println("Prepare for a orderly serving!");
        System.out.println("==============================");
        balancedJuiceBar.makeJuice().drink();
        balancedJuiceBar.makeJuice().drink();
        balancedJuiceBar.makeJuice().drink();
        balancedJuiceBar.makeJuice().drink();
        balancedJuiceBar.makeJuice().drink();
        balancedJuiceBar.makeJuice().drink();
        System.out.println("==============================");
        System.out.println("Now You'll Never know what you get!");
        System.out.println("==============================");
        randomJuiceBar.makeJuice().drink();
        randomJuiceBar.makeJuice().drink();
        randomJuiceBar.makeJuice().drink();
        randomJuiceBar.makeJuice().drink();
    }
}
