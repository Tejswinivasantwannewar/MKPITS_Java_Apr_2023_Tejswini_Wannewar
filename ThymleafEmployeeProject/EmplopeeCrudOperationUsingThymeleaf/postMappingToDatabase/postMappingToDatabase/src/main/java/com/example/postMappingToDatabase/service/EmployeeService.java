package com.example.postMappingToDatabase.service;

import com.example.postMappingToDatabase.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();
//  Page<Employee> getAllEmployee(Pageable pageable);
    void save(Employee employee);
    Employee updatebyid(Integer emp_id);
    void deleteempdatabyId(Integer emp_id);


}
