package com.example.demo2.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

//  private Account account;
//  this is object injection withount any constructor and setter injection---------------


    private Account account;
    @Autowired
    public void setAccount(Account  savingAccount) {
        this.account = savingAccount;
    }

//    This is Setter injection -----------------



    //    private Account account;
//    @Autowired
//    public DemoRestController( Account savingAccount) {
//        this.account = savingAccount;
//    }


// This is constructor injection ------




    @GetMapping("/hello")
    public String display(){

        return account.getDetailsOfAccount();
    }
}
