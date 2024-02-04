package com.example.EmployeeRegistrationAndLogin.service;

import com.example.EmployeeRegistrationAndLogin.model.Employee;

import java.util.List;

public interface EmployeeService {
    void registerEmployee(Employee employee);
 List<Employee> getAllEmployees();

   void deleteEmployee(Long id);

//    Employee findByLoginId(String loginId);
    String getEmployeeName(String loginId);

    boolean validateLogin(String loginId, String password);
}
