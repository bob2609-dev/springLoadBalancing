package com.demgo.chatbook.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chatbook-app")
public class ChatController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/chat")
    public String chatNow()
    {
        return "application is up on port: "+port;
    }

}
