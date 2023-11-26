package com.example.demo1.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class MyRest {
    @Value("${stud.name}")
    private String name;
    @GetMapping("/hello")
    public String display(){

        return "Hello My Name is  TEJUUU"+name;
    }
}
