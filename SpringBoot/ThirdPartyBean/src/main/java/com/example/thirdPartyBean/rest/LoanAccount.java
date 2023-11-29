package com.example.thirdPartyBean.rest;

public class LoanAccount implements Account {
    @Override
    public String getDetailsOfAccount() {

        return "This Is My Loan Account";
    }
}
