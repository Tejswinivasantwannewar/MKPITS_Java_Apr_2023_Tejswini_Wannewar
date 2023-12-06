package com.example.postMappingToDatabase.dao;

import com.example.postMappingToDatabase.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
