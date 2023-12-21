package com.example.postMappingToDatabase.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "employee_info")
public class Employee {
    @Id
    private  int emp_id;
    private String emp_name;
    @JsonManagedReference
    @OneToOne(cascade = CascadeType.ALL)
    private  Address address;

    public Employee() {
    }

    public Employee(int emp_id, String emp_name, Address address) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.address = address;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
