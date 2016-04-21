package com.innominds.aop.service.internal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.innominds.aop.service.SecurityService;

@Service
public class SecurityServiceImpl implements SecurityService {

    @Value("#{T(java.lang.System).currentTimeMillis()}")
    private long time;

    public Long getTime() {
        System.out.println(" " + this);
        return time;
    }

    public void setName(String username) {

        System.out.println(this + " username added " + username);
    }

    public double checkBalance() {
        System.out.println("Checking balance");
        return 500.00;

    }

}
