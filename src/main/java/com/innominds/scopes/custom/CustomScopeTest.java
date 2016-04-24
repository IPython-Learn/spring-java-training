package com.innominds.scopes.custom;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomScopeTest {

    public static void main(String[] args) {

        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(CustomScopeConfig.class);
        ctx.refresh();

        System.out.println(ctx.getBean(Employee.class));

        System.out.println(ctx.getBean(Employee.class));

        System.out.println(ctx.getBean(Employee.class));

        final Thread t1 = new Thread(() -> {
            System.out.println(ctx.getBean(Employee.class));
        });

        t1.start();

        ctx.close();

    }
}
