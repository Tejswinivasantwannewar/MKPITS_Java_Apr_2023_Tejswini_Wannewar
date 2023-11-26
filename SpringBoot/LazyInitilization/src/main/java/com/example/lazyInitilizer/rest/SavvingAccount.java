package com.example.lazyInitilizer.rest;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

//@Lazy
// this annotation if we use then which constructor we want to call we can use
//by default all beans load at time
// give all classes lazy otherwise intilize globally
// then to call Specific class use qualifier


public class SavvingAccount implements Account {

    @Override
    public String getDetailsOfAccount() {
        return "This Is My Saving Account";
    }
    public SavvingAccount(){
        System.out.println("this is my Saving Constructor");
    }

}
