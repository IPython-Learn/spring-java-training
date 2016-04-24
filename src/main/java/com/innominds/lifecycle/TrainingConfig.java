package com.innominds.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TrainingConfig {

    // <bean id="lifeCycleBean" class="com.innominds.lifecycle.TrainingConfig" />

    @Bean
    public LifeCycleBean lifeCycleBean() {
        return new LifeCycleBean();
    }

}
