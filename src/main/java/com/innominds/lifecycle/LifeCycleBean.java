package com.innominds.lifecycle;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleBean implements BeanNameAware, InitializingBean, DisposableBean {

    @Override
    public void setBeanName(String beanName) {

        System.out.println(" My Spring bean is created with name " + beanName);
    }

    public void myInit() {
        System.out.println("@@@@@@@@@@  Custom Init method @@@@@@@@@@@@@");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("########## INIT METHOD CALLED  ########## ");

    }

    @Override
    public void destroy() throws Exception {

        System.out.println("##########  DESTROY METHOD CALLED  ##########");
    }

    public void myDestroy() {
        System.out.println("@@@@@@@@@@@@  Custom destroy method  @@@@@@@@@@@@");
    }

}
