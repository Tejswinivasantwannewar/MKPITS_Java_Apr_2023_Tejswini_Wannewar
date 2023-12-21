package com.example.postMappingToDatabase.service;



import com.example.postMappingToDatabase.dao.EmployeeRepository;
import com.example.postMappingToDatabase.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceimpl implements EmployeeService {

  private EmployeeRepository employeeRepository;
@Autowired
    public EmployeeServiceimpl(EmployeeRepository employeeRepository) {

    this.employeeRepository = employeeRepository;
    }




    @Override
    @Transactional
    public String saveRecord(Employee employee) {
        employeeRepository.save(employee);
        return "data save successfully";

    }
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee find(Integer rollno) {
        Optional <Employee> studentOptional=employeeRepository.findById(rollno);
        return studentOptional.get();

    }

    @Override
    @Transactional
    public String updateRecord(Employee employee) {
    Optional<Employee> studentOptional= employeeRepository.findById(employee.getEmp_id());
    if (studentOptional.isPresent()){

        employeeRepository.save(employee);
        return "Data updated succesfully";
    }
    else
    return "data cannot updated";

    }

    @Override
    @Transactional
    public String deleteRecords(Integer rollno) {
     employeeRepository.deleteById(rollno);
     return "Data deleted Successfulyy............!!!";
    }
}
