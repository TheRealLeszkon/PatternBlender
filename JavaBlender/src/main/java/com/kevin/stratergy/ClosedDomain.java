package com.kevin.stratergy;

public class ClosedDomain implements DomainStrategy {

    @Override
    public void expandDomain(String domainExpansion) {
        System.out.printf("%s . You are trapped withing the domain barrier with no way to flee.\n",domainExpansion);
    }

}
