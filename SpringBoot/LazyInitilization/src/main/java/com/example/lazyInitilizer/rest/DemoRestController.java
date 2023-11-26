package com.example.lazyInitilizer.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

  private Account account;

 @Autowired
    public DemoRestController(@Qualifier("savvingAccount") Account savingAccount) {
        this.account = savingAccount;
    }


//This Is constructor injection in that We use Qualifier Annotation to Specify id of class which we want to call
// and to mention the bean class name should be same but strats from small letter--------


    @GetMapping("/hello")
    public String display(){

        return account.getDetailsOfAccount();
    }
}
