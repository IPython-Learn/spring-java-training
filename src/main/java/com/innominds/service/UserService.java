package com.innominds.service;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService implements InitializingBean, DisposableBean, BeanNameAware {

    @Autowired
    @Qualifier("primaryTwoSevice")
    PrimaryService primaryService;

    @Value("#{T(java.lang.System).currentTimeMillis()}")
    private long time;

    public Long getTime() {
        System.out.println(" " + this);
        return time;
    }

    public void setName(String username) {
        System.out.println(" username added " + username);
    }

    @Override
    public void setBeanName(String name) {
        System.err.println("Bean with name [ " + name + " ] created.");
    }

    @Autowired
    DepartmentService departmentService;

    public DepartmentService getDepartmentService() {
        return departmentService;
    }

    public UserService() {
        System.out.println("UserService Bean creating...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("INIT method gets invoked");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(" Destroy method ");
    }

}
