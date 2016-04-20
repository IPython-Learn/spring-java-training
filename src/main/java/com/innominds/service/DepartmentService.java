package com.innominds.service;

import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    public DepartmentService() {
        System.out.println("DepartmentService");
    }

    public void init() {
        System.out.println("init");
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
