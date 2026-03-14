package com.kevin.stratergy;

public class OpenDomain implements DomainStrategy {

    @Override
    public void expandDomain(String domainExpansion) {
        System.out.printf("%s ... The sky is tainted and the effects of the domain are far reaching.\n",domainExpansion);
    }
}
