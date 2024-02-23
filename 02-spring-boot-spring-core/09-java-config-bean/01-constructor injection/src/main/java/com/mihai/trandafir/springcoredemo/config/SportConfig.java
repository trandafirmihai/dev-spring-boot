package com.mihai.trandafir.springcoredemo.config;

import com.mihai.trandafir.springcoredemo.common.Coach;
import com.mihai.trandafir.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
