package com.example.java_spring_ai.controller;

import com.example.java_spring_ai.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private MainService mainService;

    @GetMapping("/Hello")
    public String getHello(){
        return mainService.AiMessage("What is the capital of France?");
    }
}
