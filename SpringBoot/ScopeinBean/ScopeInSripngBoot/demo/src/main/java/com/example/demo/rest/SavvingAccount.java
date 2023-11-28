package com.example.demo.rest;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

//if we have to classes which implents same interface and method then primary annotation ensures to call first ---------
// primary is mentioned in saving account and qualifier bean id we use currentAccount then @primary where we used is call first
public class SavvingAccount implements Account {
    @Override
    public String getDetailsOfAccount() {
        return "This Is My Saving Account";
    }


//    public String getDetailsOfAccount(){
//        return "This Is My Saving Account";
//    }
}
