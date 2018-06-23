package com.fatboa.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    public CricketCoach() {
         System.out.println("Cricket coach : inside no-arg constructor");
    }
    
    public void setFortuneService(FortuneService fortuneService) {
    	System.out.println("CricketCoach: inside setter method - setFortuneService")
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes per day";
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }
}
