package com.mihai.trandafir.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TenisCoach implements Coach{

    public TenisCoach() {
        System.out.println("In constructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Be technically tactical with that opponent.";
    }
}
