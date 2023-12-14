package com.example.postMappingToDatabase.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class Employee {
@Id


    private  int Emp_id;
@Size(min=1,message = "Minimum three letter required")
@NotNull(message = "name is required")
  
    private String Emp_name="";

    private  String Emp_address;

    private  String Emp_city;

    public Employee() {
    }

    public Employee(int emp_id, String emp_name, String emp_address, String emp_city) {
        Emp_id = emp_id;
        Emp_name = emp_name;
        Emp_address = emp_address;
        Emp_city = emp_city;
    }

    public int getEmp_id() {
        return Emp_id;
    }

    public void setEmp_id(int emp_id) {
        Emp_id = emp_id;
    }

    public String getEmp_name() {
        return Emp_name;
    }

    public void setEmp_name(String emp_name) {
        Emp_name = emp_name;
    }

    public String getEmp_address() {
        return Emp_address;
    }

    public void setEmp_address(String emp_address) {
        Emp_address = emp_address;
    }

    public String getEmp_city() {
        return Emp_city;
    }

    public void setEmp_city(String emp_city) {
        Emp_city = emp_city;
    }
}
