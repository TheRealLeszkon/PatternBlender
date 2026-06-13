package com.kevin.coolstuff.functionalinterfaces;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class NPC {
    private String name;
    private int health;

    public NPC(String name) {
        this.name = name;
        this.health = 100;
    }

}
