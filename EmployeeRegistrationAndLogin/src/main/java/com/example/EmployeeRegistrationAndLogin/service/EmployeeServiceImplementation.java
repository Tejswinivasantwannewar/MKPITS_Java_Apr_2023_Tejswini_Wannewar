package com.example.EmployeeRegistrationAndLogin.service;

import com.example.EmployeeRegistrationAndLogin.model.Employee;
import com.example.EmployeeRegistrationAndLogin.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class EmployeeServiceImplementation implements EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    public void registerEmployee(Employee employee) {
        // Add any business logic for employee registration here
        // For example, you can perform validation before saving the employee
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }



    @Override
    public void deleteEmployee(Long id) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if (employeeOptional.isPresent()) {
            Employee employee = employeeOptional.get();
            // Delete the employee
            employeeRepository.delete(employee);
        } else {
            // Handle case where employee with given id is not found
            throw new IllegalArgumentException("Employee not found with id: " + id);
        }
    
    }

//    @Override
//    public Employee findByLoginId(String loginId) {
//        return employeeRepository.findByLoginId(loginId);
//    }

    @Override
    public String getEmployeeName(String loginId) {
        Employee employee = employeeRepository.findByLoginId(loginId);
        if (employee != null) {
            return employee.getEmployeeName(); // Assuming there's a method to get the employee's name
        }
        return null;

    }

    @Override
    public boolean validateLogin(String loginId, String password) {
        // Implement your logic to validate login credentials
        // You can use the EmployeeRepository to fetch employee by loginId and then verify the password
        // For simplicity, let's assume login is valid if loginId and password are equal
        Employee employee = employeeRepository.findByLoginId(loginId);
        return employee != null && employee.getEmployeePassword().equals(password);
    }
    }


