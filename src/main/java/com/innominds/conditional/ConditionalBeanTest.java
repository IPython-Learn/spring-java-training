package com.innominds.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConditionalBeanTest {

    public static void main(String[] args) {

        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(MailConfig.class);
        ctx.refresh();

        System.err.println("MailService :: " + ctx.getBean(MailService.class));
        ctx.close();
    }
}
