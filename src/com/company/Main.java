package com.company;

import Business.abstracts.UserService;
import Business.concretes.LoginManager;
import Business.concretes.UserManager;
import Core.GoogleManagerAdapter;
import Core.concretes.CheckManager;
import Core.concretes.EmailManager;
import DataAccess.concretes.HibernateUserDao;
import Entities.concretes.User;

public class Main {

    public static void main(String[] args) {

        UserService userService=new UserManager(new LoginManager(new HibernateUserDao(), new CheckManager(),
                new EmailManager()), new GoogleManagerAdapter());

        User gizem = new User("Gizem","Coskun","gizemcsk1@gmail.com","Gizem1234");

        userService.register(gizem);
        userService.login("gizemcsk1@gmail.com","Gizem1234");


        System.out.println("----GOOGLE----");
        userService.registerGoogle();

       // Aynı kullanıcı bilgilerini girip tekrar deniyorum.


        User user1 = new User("Gizem","Coskun","gizemcsk1@gmail.com","Gizem1234");

        userService.register(user1);

    }
}
