package com.innominds.scopes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopeTest {

    public static void main(String[] args) {

        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(BeanScopeConfig.class);
        ctx.refresh();

        System.out.println(ctx.getBean("paymentService"));

        System.out.println(ctx.getBean("paymentService"));

        System.out.println(ctx.getBean("paymentService") == ctx.getBean("paymentService"));

        ctx.close();
    }
}
