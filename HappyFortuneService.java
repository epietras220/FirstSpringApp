package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
    public String getFortune() {
        String[] tab = new String[3];
        Random generator = new Random();
        tab[0] = "Today is your lucky day!";
        tab[1] = "You win free coffee!";
        tab[2] = "Your bus is waiting for you!";

        return tab[generator.nextInt(3)];
    }
}
