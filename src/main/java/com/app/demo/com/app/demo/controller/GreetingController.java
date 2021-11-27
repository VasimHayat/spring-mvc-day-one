package com.app.demo.com.app.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

    @GetMapping({"/","greeting"})
    public String greetings(){
        return "greeting";
    }
}
