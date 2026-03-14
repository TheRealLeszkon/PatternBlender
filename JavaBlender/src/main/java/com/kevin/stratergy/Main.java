package com.kevin.stratergy;

public class Main {
    public static void main(String[] args) {
        Character gojo = new Character("Satoru Gojo",110,"Unlimited Void",new ClosedDomain());
        gojo.expandDomain();
        Character sukuna = new Character("Ryomen Sukuna",120,"Malevolent Shrine",new OpenDomain());
        sukuna.expandDomain();
    }
}
