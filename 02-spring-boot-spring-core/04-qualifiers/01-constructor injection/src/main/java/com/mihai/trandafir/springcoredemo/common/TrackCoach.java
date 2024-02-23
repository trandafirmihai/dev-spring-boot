package com.mihai.trandafir.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Run as if you need to get off the ground and fly.";
    }
}
