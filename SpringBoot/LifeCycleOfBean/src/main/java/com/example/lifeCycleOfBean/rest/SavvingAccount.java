package com.example.lifeCycleOfBean.rest;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component


//if we have to classes which implents same interface and method then primary annotation ensures to call first ---------
// primary is mentioned in saving account and qualifier bean id we use currentAccount then @primary where we used is call first
public class SavvingAccount implements Account {
    public SavvingAccount(){
        System.out.println("this is my saving account");
    }
    @Override
    public String getDetailsOfAccount() {

        return "This Is My Saving Account";
    }


//    public String getDetailsOfAccount(){
//        return "This Is My Saving Account";
//    }
}
