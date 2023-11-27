package com.example.lifeCycleOfBean.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {


    private Account account;


@Autowired
public DemoRestController(@Qualifier("currentAccount") Account savingAccount) {
    this.account = savingAccount;

}





    @GetMapping("/life")
    public String displayBeansLifeCycle(){

        return account.getDetailsOfAccount();
    }


}
