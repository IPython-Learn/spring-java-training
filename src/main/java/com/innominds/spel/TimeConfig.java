package com.innominds.spel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TimeConfig {

    @Bean
    TimeService timeService() {

        return new TimeService();
    }
}
