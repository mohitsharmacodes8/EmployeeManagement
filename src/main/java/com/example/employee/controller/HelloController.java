package com.example.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping
    public String home() {
        return "Welcome to Employee Management System!";
    }

    @GetMapping("/test")
    public String test() {
        return "Test Endpoint Working!";
    }
}
