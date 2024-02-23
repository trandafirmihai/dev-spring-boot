package com.mihai.trandafir.springcoredemo.rest;

import com.mihai.trandafir.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for dependency
    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach) {
        System.out.println("In constructor " + getClass().getSimpleName());
        myCoach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
