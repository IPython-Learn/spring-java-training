package com.innominds.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
// when it is true . it uses CGLIB to create proxies.
@Configuration
public class SpringAOPConfiguration {

    @Before("execution(** com.innominds.service.*.*())")
    public void beforeMethod() {
        System.out.println(this); // add break point and check value. that tells that it uses CGLIBG
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

    }

    @Before("execution(** com.innominds.service.UserService.setName(String)) && args(username)")
    public void beforeArgs(String username) {
        System.out.println(" ARGUMENT PASSED" + username);
    }

    @Around("execution(** com.innominds.service.*.*())")
    public void log(ProceedingJoinPoint joinPoint) {

        try {
            final Object object = joinPoint.proceed();

            System.out.println("Around advice return " + object);
        } catch (final Throwable e) {
            e.printStackTrace();
        }

        System.out.println("  " + joinPoint.getKind() + " Executed in seconds ");

    }

}
