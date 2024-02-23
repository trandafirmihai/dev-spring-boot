package com.mihai.trandafir.springcoredemo.common;

import org.springframework.stereotype.Component;

//@Component
public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Be like water my friend.";
    }
}
