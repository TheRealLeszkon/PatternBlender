package com.kevin.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main {
    public static String greet(String name){
        return "Welcome"+name;
    }
    @Test
    public void test(){
        String output =greet("Mike");
        Assertions.assertEquals("WelcomeMike",output);
        Assertions.assertEquals("Welcome Mike", output);
    }
    public static void main(String[] args) {



    }
}
