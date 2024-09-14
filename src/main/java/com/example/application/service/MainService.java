package com.example.application.service;

import org.springframework.ai.chat.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    @Autowired
    private ChatClient chatClient;

    public String AiMessage(String prompt){
        return chatClient.call(prompt);
    }

}
