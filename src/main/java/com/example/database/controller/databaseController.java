package com.example.database.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class databaseController {

    @GetMapping("hello")
    public String helloWorld()
    {
        return "hello world";
    }
}
