package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @Value("${greeting-name: Mirage}") // mirage is the default if the variable isn't defined
    // in application.properties file
    private String name;

    @GetMapping
    String getGreeting() {
        return name;
    }
}
