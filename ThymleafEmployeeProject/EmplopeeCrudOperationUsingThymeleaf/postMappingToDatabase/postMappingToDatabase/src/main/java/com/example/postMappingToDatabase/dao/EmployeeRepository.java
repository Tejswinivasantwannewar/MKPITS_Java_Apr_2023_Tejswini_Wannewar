package com.example.postMappingToDatabase.dao;


import com.example.postMappingToDatabase.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
