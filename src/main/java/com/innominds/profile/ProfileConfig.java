package com.innominds.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public AccountService accountServiceDev() {
        System.out.println("   ##### DEV ENVIRONMENT ACCOUNT SERVICE  #####  ");
        return new AccountService();
    }

    @Bean
    @Profile("prod")
    public AccountService accountServiceProd() {
        System.out.println("   ##### PRODUCTION ENVIRONMENT ACCOUNT SERVICE  #####  ");
        return new AccountService();
    }
}
