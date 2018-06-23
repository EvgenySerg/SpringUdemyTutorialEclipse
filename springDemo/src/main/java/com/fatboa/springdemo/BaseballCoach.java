package com.fatboa.springdemo;

public class BaseballCoach implements Coach{
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }

    public String getDailyWorkout() {
        return "Spend 30 minutes for batting.";

    }
}
