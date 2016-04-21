package com.innominds.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.innominds.aop.service.SecurityService;

public class SpringAOPTest {

    public static void main(String[] args) {

        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(SpringAOPConfiguration.class);
        ctx.refresh();

        final SecurityService securityService = ctx.getBean(SecurityService.class);

        System.out.println(securityService.checkBalance());

        ctx.close();

    }
}
