package com.example.demo.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {


    private Account account1;
    private Account account2;

@Autowired
public DemoRestController(@Qualifier("currentAccount") Account savingAccount1,@Qualifier("currentAccount") Account savingAccount2) {
    this.account1 = savingAccount1;
    this.account2 = savingAccount2;
}




    @GetMapping("/check")
    public String displayBeans(){

        return "Returns Tne  Scope :- " +(account1==account2);
    }
}
