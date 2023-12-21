package com.example.postMappingToDatabase.service;





import com.example.postMappingToDatabase.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
////
    Employee find(Integer rollno);

    public String saveRecord(Employee employee);
    public String updateRecord(Employee employee);
    public String deleteRecords(Integer rollno);
}
