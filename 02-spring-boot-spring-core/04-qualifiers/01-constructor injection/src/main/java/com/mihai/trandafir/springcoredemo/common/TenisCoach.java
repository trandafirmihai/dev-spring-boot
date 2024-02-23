package com.mihai.trandafir.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TenisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Be technically tactical with that opponent.";
    }
}
