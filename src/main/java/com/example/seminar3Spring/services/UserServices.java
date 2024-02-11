package com.example.seminar3Spring.services;

import com.example.seminar3Spring.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Autowired
    private  NotificationService notificationService;

    public UserServices(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public User createrUser(String name,String email, int age){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setAge(age);


        notificationService.notifyUser(user);

        return user;
    }
}
