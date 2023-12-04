package com.example.demoRestDatabaseTableShow.service;



import com.example.demoRestDatabaseTableShow.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student find(Integer rollno);
}
