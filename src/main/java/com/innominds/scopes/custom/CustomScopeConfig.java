package com.innominds.scopes.custom;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class CustomScopeConfig {

    @Bean
    @Scope("thread")
    public Employee employee() {
        return new Employee();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {

        final CustomScopeConfigurer config = new CustomScopeConfigurer();

        config.addScope("thread", threadScope());

        return config;

    }

    @Bean
    ThreadScope threadScope() {

        return new ThreadScope();
    }

}
