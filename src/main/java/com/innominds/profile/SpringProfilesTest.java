package com.innominds.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringProfilesTest {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "prod");
        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(ProfileConfig.class);
        ctx.refresh();
        ctx.close();
    }
}
