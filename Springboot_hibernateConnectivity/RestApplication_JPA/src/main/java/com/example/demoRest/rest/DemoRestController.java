package com.example.demoRest.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoRestController {
    @GetMapping("/hello")
    public  String getMessage(){
        return  "hiiii i am teju";
    }
}
