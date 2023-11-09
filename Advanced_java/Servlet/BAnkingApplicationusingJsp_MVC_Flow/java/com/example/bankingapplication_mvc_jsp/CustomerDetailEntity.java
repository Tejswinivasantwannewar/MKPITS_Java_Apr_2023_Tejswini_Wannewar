package com.example.bankingapplication_mvc_jsp;

public class CustomerDetailEntity {
    public CustomerDetailEntity() {
    }
    private String user_id;
    private String password;
    private String name;
    private  String address;
    private  String city;
    private  String mobile_number;
    private  String balance;

    public CustomerDetailEntity(String user_id, String password, String name, String address, String city, String mobile_number, String balance) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.address = address;
        this.city = city;
        this.mobile_number = mobile_number;
        this.balance = balance;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }
}
