package com.innominds.scopes.custom;

public class Employee {

    public Employee() {
        System.out.println(" employee " + Thread.currentThread().getName());
    }
}
