package com.telusko.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        System.out.println("I am here");
        return "Hey Good day";
    }

    @RequestMapping("/home")
    public String home() {
        return "Hey Home page";
    }
}
