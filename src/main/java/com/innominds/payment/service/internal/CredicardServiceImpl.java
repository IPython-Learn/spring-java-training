package com.innominds.payment.service.internal;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.innominds.payment.service.PaymentService;

@Service("creditCardService")
@Primary
public class CredicardServiceImpl implements PaymentService {

    @Override
    public void makePayment(double amount) {

        System.out.println("CreditCard payment done ");
    }
}
