package com.innominds.service;

import org.springframework.beans.factory.annotation.Autowired;

public class BookFactory {

    private BookFactory() {
    }

    @Autowired
    UserService userService;

    public static BookFactory getInstance() {

        return new BookFactory();
    }

    public UserService getUserService() {
        return userService;
    }

}
