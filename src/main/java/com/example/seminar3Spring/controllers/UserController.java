package com.example.seminar3Spring.controllers;

import com.example.seminar3Spring.domain.User;
import com.example.seminar3Spring.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private RegistrationService service;
    @GetMapping
    public List<User> userList(){
        return service.getdataProcessingService().getRepository().getUsers();
    }
    @PostMapping("/body")
    public String userAddFromBody(@RequestBody User user){
        service.getdataProcessingService().getRepository().getUsers().add(user);
        return "User added from body!";
    }
}
