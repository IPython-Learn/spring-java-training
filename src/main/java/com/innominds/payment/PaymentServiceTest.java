package com.innominds.payment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.innominds.payment.service.BankService;

public class PaymentServiceTest {

    public static void main(String[] args) {

        final AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(PaymentConfig.class);
        ctx.refresh();

        final BankService bankService = ctx.getBean(BankService.class);

        bankService.debitAmount(1000);

        ctx.close();
    }
}
