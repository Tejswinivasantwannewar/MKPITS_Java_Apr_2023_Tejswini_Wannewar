package com.example.thymeleafProject1.entity;




public class Student {

    private  int rollno;
    private String name;
    private  String address;
    private  String city;
    private  String courses;
    private  String Gender;

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Student(String courses) {
        this.courses = courses;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

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
