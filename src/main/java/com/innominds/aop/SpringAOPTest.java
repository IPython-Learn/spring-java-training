package com.innominds.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.innominds.aop.service.AccountService;

public class SpringAOPTest {

    public static void main(String[] args) {

        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AccountServiceAspect.class);
        ctx.refresh();

        final AccountService accountService = ctx.getBean(AccountService.class);

        System.out.println(accountService.getTime());

        ctx.close();

    }
}
