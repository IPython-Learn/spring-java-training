package com.innominds.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MailConfig {

    @Bean
    @Conditional(WindowsMailCondition.class)
    MailService windowsMailService() {
        return new WindowMailServiceImpl();
    }

    @Bean
    @Conditional(MacMailCondition.class)
    MailService macMailService() {
        return new MacMailServiceImpl();
    }
}
