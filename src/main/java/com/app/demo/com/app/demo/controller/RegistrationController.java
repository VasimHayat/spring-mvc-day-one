package com.app.demo.com.app.demo.controller;

import com.app.demo.com.app.demo.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping({"registration"})
    public String getRegistration(@ModelAttribute("registrationModel")Registration registration){

        return "registration";
    }

    @PostMapping({"registration"})
    public String PostRegistration(@ModelAttribute("registrationModel")Registration registration){

        return "registration";
    }
}
