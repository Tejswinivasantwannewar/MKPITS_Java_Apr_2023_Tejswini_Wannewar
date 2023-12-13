package com.example.thymeleafProject1.entity;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Student {

    private  int rollno;
   @Size(min =1,message = "is required")
   @NotNull(message = "is required")
    private String name="";

    private  String address;
    private  String city;

    public Student() {
    }

    public Student(int rollno, String name, String address, String city) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
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
}
