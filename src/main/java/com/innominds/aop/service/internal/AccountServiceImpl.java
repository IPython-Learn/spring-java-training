package com.innominds.aop.service.internal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.innominds.aop.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

    @Value("#{T(java.lang.System).currentTimeMillis()}")
    private long time;

    @Override
    public Long getTime() {
        System.out.println(" " + this);
        return time;
    }

    @Override
    public void setName(String username) {

        System.out.println(this + " username added " + username);
    }

    @Override
    public double checkBalance() {
        System.out.println("Inside Checking balance");
        // throw new RuntimeException("Balanace checking errror");
        return 500.00;

    }

}
