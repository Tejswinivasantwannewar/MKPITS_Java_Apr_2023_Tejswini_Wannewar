/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author tejswini
 */
public class Student {

    public Student() {
        
    }

    private String roll_number;
    private String name;
    private String address;
    private String city;

    public Student(String roll_number, String name, String address, String city) {
        this.roll_number = roll_number;
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public String getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(String roll_number) {
        this.roll_number = roll_number;
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
