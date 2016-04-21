package com.innominds.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.innominds.payment.PaymentConfig;
import com.innominds.payment.service.PaymentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PaymentConfig.class })
@ActiveProfiles(profiles = { "dev" })
public class PaymentServiceTest {

    @Autowired
    PaymentService paymentService;

    @Test
    public void makePaymentTest() {

        paymentService.makePayment(1000.00);

    }

}
