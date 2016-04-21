package com.innominds.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * since we are working java based configuration, spring borrows <br>
 * AspectJ annotations to enable Spring AOP.
 *
 *
 * SETUP 1.Add @Aspect annotation. 2. Add @EnableAspectJAutoProxy annotation to enable AOP.
 *
 *
 * @author ThirupathiReddy V
 *
 */
@Aspect
@EnableAspectJAutoProxy(proxyTargetClass = true)
// when it is true . it uses CGLIB to create PROXIES by extending the Target class.
// ADD DEBUG POINT ON checkBalance method and check significance of proxyTargetClass value
// on how SecurityService PROXY created
@Configuration
@ComponentScan("com.innominds.aop")
public class SpringAOPConfiguration {

    @Pointcut("execution(** com.innominds.aop.service.*.*())")
    public void servicePointCut() {

    }

    @Before("servicePointCut()")
    public void beforeMethod() {

        System.out.println(this); // add break point and check value. that tells that it uses CGLIBG
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

    }

    @After("servicePointCut()")
    public void afterMethod() {
        System.out.println("????????????????????????????????????????????");
    }

    @Before("execution(** com.innominds.aop.service.SecurityService.setName(String)) && args(username)")
    public void beforeArgs(String username) {
        System.out.println(" ARGUMENT PASSED" + username);
    }

    @Around("execution(** com.innominds.aop.service.*.*())")
    public Object log(ProceedingJoinPoint joinPoint) {

        try {
            final Object object = joinPoint.proceed();
            System.out.println("Around advice return " + object);

            return Double.valueOf(object.toString()) + 200.00;

        } catch (final Throwable e) {
            e.printStackTrace();
        }

        System.out.println("  " + joinPoint.getKind() + " Executed in seconds ");
        return 100.00;

    }

}
