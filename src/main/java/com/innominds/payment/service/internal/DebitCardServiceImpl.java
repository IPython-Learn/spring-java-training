package com.innominds.payment.service.internal;

import org.springframework.stereotype.Service;

import com.innominds.payment.service.PaymentService;

@Service("debitCardService")
public class DebitCardServiceImpl implements PaymentService {

    @Override
    public void makePayment(double amount) {

        System.out.println("Debitcard payment done ");
    }
}
