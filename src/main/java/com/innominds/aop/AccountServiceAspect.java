package com.innominds.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Aspect
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = false)
@ComponentScan("com.innominds.aop.service")
public class AccountServiceAspect {

    @Pointcut("execution(** com.innominds.aop.service.AccountService.checkBalance())")
    public void balanceCheckPointCut() {

    }

    @Before("balanceCheckPointCut()")
    public void privilegeCheckAdvice() {
        System.out.println("###################  Checking privileges ############## ");

        if (!isUserHasPrivileges()) {
            throw new RuntimeException("Used doesn't have privileges ");

        }
    }

    boolean isUserHasPrivileges() {

        return false;
    }

}
