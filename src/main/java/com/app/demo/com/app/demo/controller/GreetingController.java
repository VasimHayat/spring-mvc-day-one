package com.app.demo.com.app.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping({"greeting"})
    public String greetings(Map<String,Object> model){
        model.put("message","Hello");
        return "greeting";
    }
}
