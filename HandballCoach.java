package com.luv2code.springdemo;

public class HandballCoach implements Coach {

    FortuneService fortuneService;

    public HandballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return " Practise your defensive";
    }

    public String getDailyFortune() {
        return "Handball coach says: " + fortuneService.getFortune();
    }
}
