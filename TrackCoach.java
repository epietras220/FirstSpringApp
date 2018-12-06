package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService; // dzięki temu że jest tutaj to pole wygenerowany konstruktor także od razu je posiada

    public TrackCoach(FortuneService fortuneService) {

        this.fortuneService = fortuneService;
    }

    public TrackCoach() {
    }

    public String getDailyWorkout() {

        return "Run a hard 5k";
    }

    public String getDailyFortune() {

        return "Just do it: " + fortuneService.getFortune();
    }
    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    public void doMyCleanupStuff(){
        System.out.println("TrackCoach: inside method doMySCleanupStuff");
    }


}
