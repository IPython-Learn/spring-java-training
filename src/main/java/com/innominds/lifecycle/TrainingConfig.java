package com.innominds.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TrainingConfig {

    // <bean id="lifecycleBean" class="" />
    @Bean
    public LifeCycleBean lifeCycleBean() {
        return new LifeCycleBean();
    }

}
