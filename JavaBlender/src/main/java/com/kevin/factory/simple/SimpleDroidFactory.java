package com.kevin.factory.simple;

public class SimpleDroidFactory {
    public Droid createDroid(DroidType type) {
        return switch (type) {
            case B1 -> new B1Droid();
            case B2 -> new B2Droid();
        };
    }
}