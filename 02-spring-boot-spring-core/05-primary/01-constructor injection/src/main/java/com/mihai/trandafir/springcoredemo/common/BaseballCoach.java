package com.mihai.trandafir.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Don't lose the ball. Always catch it in first time.";
    }
}
