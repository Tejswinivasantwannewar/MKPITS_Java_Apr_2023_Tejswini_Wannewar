package com.example.demoProject.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student_info")
public class Student {
    @Id
    private  int rollno;


    private String name;
    private String address;
    private String city;

    @OneToOne(cascade = CascadeType.ALL)
    private Address addressstud;
    public Student() {
    }
    public Student(int rollno, String name, String address, String city, Address addressstud) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
        this.city = city;
        this.addressstud = addressstud;
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

    public Address getAddressstud() {
        return addressstud;
    }

    public void setAddressstud(Address addressstud) {
        this.addressstud = addressstud;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
