package com.example.seminar3Spring.controllers;

import com.example.seminar3Spring.domain.User;
import com.example.seminar3Spring.services.DataProcessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private DataProcessingService service;

    @GetMapping
    public List<String> getAllTasks(){
        List<String> tasks = new ArrayList<>();
        tasks.add("sort");
        tasks.add("filter");
        tasks.add("calc");
        return tasks;
    }

    @GetMapping("/sort")
    public List<User> sortUserByAge(){
        return service.sortUserByAge(service.getRepository().getUsers());
    }
    @GetMapping("/filter/{age}")
    public List<User> filterUserByAge(@PathVariable int age){
        return service.filterUsersByAge(service.getRepository().getUsers(),age);
    }
    @GetMapping("/calc")
    public double calculateAverageAge(){
        return service.calculateAverageAge(service.getRepository().getUsers());
    }

}
