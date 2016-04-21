package com.innominds.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.innominds.aop.SpringAOPConfiguration;

@Configuration
@Import({ AdvancedConfiguration.class, SpringAOPConfiguration.class })
@ComponentScan(basePackages = { "com.innominds.service" })
public class CoreConfiguration {

    //
}
