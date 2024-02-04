package com.example.EmployeeRegistrationAndLogin.repository;

import com.example.EmployeeRegistrationAndLogin.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Employee findByLoginId(String loginId);
}
