package com.example.seminar3Spring.services;

import com.example.seminar3Spring.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private UserServices userServices;
    private NotificationService notificationService;
    public DataProcessingService getdataProcessingService(){return dataProcessingService; }

    @Autowired
    private DataProcessingService dataProcessingService;

    public void processRegistration(String name,String email, int age){
        User user = userServices.createrUser(name,email,age); // создаем пользователя

        dataProcessingService.addUserToList(user);// добавляем в репозиторий

        notificationService.notifyUser(user); // выводим сообщение
    }
}
