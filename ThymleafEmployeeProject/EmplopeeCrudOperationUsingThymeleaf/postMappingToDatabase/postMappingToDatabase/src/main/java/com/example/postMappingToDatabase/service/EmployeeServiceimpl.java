package com.example.postMappingToDatabase.service;



import com.example.postMappingToDatabase.dao.EmployeeRepository;
import com.example.postMappingToDatabase.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceimpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceimpl(EmployeeRepository studentRepository) {

        this.employeeRepository = studentRepository;
    }

    @Override
    public List<Employee> getAllEmployee() {

        return employeeRepository.findAll();
    }


    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee updatebyid(Integer emp_id) {
        Optional<Employee> optional = employeeRepository.findById(emp_id);
        Employee employee = null;
        if (optional.isPresent())
            employee = optional.get();
        else
            throw new RuntimeException(
                    "Employee not found for id : " + emp_id);
        return employee;
    }


    @Override

    public void deleteempdatabyId(Integer emp_id)
    {

        employeeRepository.deleteById(emp_id);
    }

}


