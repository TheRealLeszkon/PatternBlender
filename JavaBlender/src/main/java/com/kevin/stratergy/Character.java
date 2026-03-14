package com.kevin.stratergy;


public class Character {
    private String name;
    private int hp;

    private String domainExpansion;
    private DomainStrategy domainStrategy;

    public Character(String name, int hp, String domainExpansion,DomainStrategy domainStrategy){
        this.name =name;
        this.hp=hp;
        this.domainExpansion = domainExpansion;
        this.domainStrategy =domainStrategy;
    }


    public void expandDomain(){
        System.out.println(this.name + " used Domain Expansion!");
        this.domainStrategy.expandDomain(this.domainExpansion);
    }
}
