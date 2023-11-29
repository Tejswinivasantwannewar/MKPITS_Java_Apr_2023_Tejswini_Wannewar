package com.example.thirdPartyBean.configuration;


import com.example.thirdPartyBean.rest.Account;
import com.example.thirdPartyBean.rest.LoanAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Using third party bean

@Configuration

public class ConfigClassBean {
    @Bean
    public Account loanAccount(){
        return  new LoanAccount();
    }
}
