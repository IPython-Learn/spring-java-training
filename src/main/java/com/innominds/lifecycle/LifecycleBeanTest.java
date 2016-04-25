package com.innominds.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifecycleBeanTest {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(MySpringConfig.class);// passing configuration class
        // ctx.scan("com.innominds.lifecycle");//passing base package
        System.out.println("Creating the container ");

        ctx.refresh();// beans created with this method inside container

        System.out.println("Destroing the container ");
        ctx.close();
    }
}
