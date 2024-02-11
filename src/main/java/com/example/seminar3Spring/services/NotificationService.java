package com.example.seminar3Spring.services;

import com.example.seminar3Spring.domain.User;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public void notifyUser(User user) {
        System.out.println("A new user has been created: " + user.getName());
    }
    private void sendNotification(String s){
        System.out.println(s);
    }
}
