package com.innominds.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifecycleBeanTest {

    public static void main(String[] args) {

        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(TrainingConfig.class);
        System.out.println(" creating the container ");
        ctx.refresh();// beans created with this method inside container

        System.out.println(" destroing the container ");
        ctx.close();

    }
}
