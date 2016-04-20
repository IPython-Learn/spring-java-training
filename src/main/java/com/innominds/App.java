package com.innominds;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.innominds.config.CoreConfiguration;
import com.innominds.service.BookFactory;
import com.innominds.service.PrimaryService;
import com.innominds.service.UserService;

/**
 * @author ThirupathiReddy
 *
 */
public class App {
    public static void main(String[] args) {

        System.setProperty("spring.profiles.active", "prod");
        final AnnotationConfigApplicationContext aCtx = new AnnotationConfigApplicationContext();
        aCtx.register(CoreConfiguration.class);
        aCtx.refresh();// it will creates the registered beans

        UserService userService = (UserService) aCtx.getBean("userService");

        userService.setName("thiru");

        System.out.println("+++++++++++++++++++++");
        System.out.println(userService.getTime());

        System.out.println(userService);
        userService = (UserService) aCtx.getBean("userService");

        System.out.println(userService);

        System.out.println(userService.getDepartmentService());

        final BookFactory bookFactory = aCtx.getBean(BookFactory.class);

        final PrimaryService primaryService = aCtx.getBean(PrimaryService.class);

        System.out.println(primaryService);

        System.out.println(bookFactory);

        System.out.println(bookFactory.getUserService());

        aCtx.close();

    }
}
