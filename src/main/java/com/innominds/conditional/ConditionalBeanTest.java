package com.innominds.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConditionalBeanTest {

    public static void main(String[] args) {

        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(StudentConfig.class);
        ctx.refresh();
        ctx.close();
    }
}
