package com.example.demoRestDatabaseTableShow.dao;



import com.example.demoRestDatabaseTableShow.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAll();
    Student find(Integer rollno);
}
