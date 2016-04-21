package com.innominds.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    @Conditional(StudentCondition.class)
    StudentService studentService() {
        return new StudentService();
    }
}
