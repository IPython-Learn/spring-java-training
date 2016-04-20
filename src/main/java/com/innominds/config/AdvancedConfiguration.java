package com.innominds.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import com.innominds.service.DepartmentService;
import com.innominds.service.StudentCondition;
import com.innominds.service.StudentService;
import com.innominds.service.UserService;

@Configuration
public class AdvancedConfiguration {

    @Bean()
    @Primary
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    // less prone of errors
    @Profile("prod")
    public UserService customService() {
        return new UserService();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public DepartmentService departmentService() {

        return new DepartmentService();
    }

    @Bean
    public com.innominds.service.BookFactory BookFactory() {

        return com.innominds.service.BookFactory.getInstance();
    }

    @Bean
    @Conditional(StudentCondition.class)
    public StudentService studentService() {
        return new StudentService();
    }
}
