package com.example.lazyInitilizer.rest;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CurrentAccount implements Account{
    @Override
    public String getDetailsOfAccount() {
        return "This Is My Current Account";
    }
    public CurrentAccount(){
        System.out.println("This is my Current Account Constructor");
    }
}
