package com.example.bankingapplication_mvc_jsp;

import java.sql.Date;

public class TranscationEntity {
    public TranscationEntity() {
    }

    private String User_id;
    private Date transaction_date;
    private int amount;
    private String transaction_type;

    private  String Credit;
    private  String Debit;
    private  String usenameTransfer;

    public TranscationEntity(String credit, String debit, String usenameTransfer) {
        Credit = credit;
        Debit = debit;
        this.usenameTransfer = usenameTransfer;
    }

    public String getCredit() {
        return Credit;
    }

    public void setCredit(String credit) {
        Credit = credit;
    }

    public String getDebit() {
        return Debit;
    }

    public void setDebit(String debit) {
        Debit = debit;
    }

    public String getUsenameTransfer() {
        return usenameTransfer;
    }

    public void setUsenameTransfer(String usenameTransfer) {
        this.usenameTransfer = usenameTransfer;
    }

    public TranscationEntity(String user_id, Date transaction_date, int amount, String transaction_type) {
        User_id = user_id;
        this.transaction_date = transaction_date;
        this.amount = amount;
        this.transaction_type = transaction_type;
    }

    public String getUser_id() {
        return User_id;
    }

    public void setUser_id(String user_id) {
        User_id = user_id;
    }

    public Date getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(Date transaction_date) {
        this.transaction_date = transaction_date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }
}