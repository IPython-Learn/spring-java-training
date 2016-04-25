package com.innominds.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySpringConfig {

    // <bean id="lifeCycleBean" class="com.innominds.lifecycle.TrainingConfig" />

    @Bean(initMethod = "myInit", destroyMethod = "myDestroy")
    public LifeCycleBean lifeCycleBean() {
        return new LifeCycleBean();
    }

}
