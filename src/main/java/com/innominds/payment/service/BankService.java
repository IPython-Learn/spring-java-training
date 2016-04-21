package com.innominds.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BankService {

    @Autowired
    @Qualifier("creditCardService")
    PaymentService paymentService;

    public void debitAmount(double amount) {
        paymentService.makePayment(amount);
    }

}
