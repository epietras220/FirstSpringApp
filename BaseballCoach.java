package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

    // define a private field for the dependency
    private FortuneService fortuneService;

    // define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout(){

        return "Spend 30 minutes on batting practise"; // uderzenie
    }
    // use my fortuneService to get a fortune
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
