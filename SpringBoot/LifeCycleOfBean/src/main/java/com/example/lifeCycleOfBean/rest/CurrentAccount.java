package com.example.lifeCycleOfBean.rest;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class CurrentAccount implements Account{
    public CurrentAccount(){
        System.out.println("this is my current account");
    }
    @Override
    public String getDetailsOfAccount() {
        return "This Is My Current Account";
    }
@PostConstruct
    public void startWork(){
        System.out.println("Current Account Starts "+getClass().getSimpleName());
    }
//    @PostConstruct
//    public void endWork(){
//        System.out.println("Current Accoun Ends");
//    }
@PreDestroy
    public void endWork(){
        System.out.println("Current Accoun Ends"+getClass().getName());
    }
}
