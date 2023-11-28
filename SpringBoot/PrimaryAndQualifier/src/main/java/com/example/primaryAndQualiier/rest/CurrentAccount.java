package com.example.primaryAndQualiier.rest;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CurrentAccount implements Account{
    @Override
    public String getDetailsOfAccount() {
        return "This Is My Current Account";
    }
}