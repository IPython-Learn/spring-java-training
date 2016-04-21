package com.innominds.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleBean implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {

        System.err.println("  ########## INIT METHOD CALLED  ##########    ");

    }

    @Override
    public void destroy() throws Exception {

        System.err.println("   ##########  DESTROY METHOD CALLED  ##########  ");
    }
}
