package com.example.demoProject.dao;

import com.example.demoProject.entity.Student;
import jakarta.persistence.TypedQuery;

import java.util.List;

public interface StudentDAO {
    public void save(Student student);

    Student find(Integer rollno);

    public void deleteRecords(Integer rollno);
    Student updateRecord(Student student);

  List<Student> findAll();
}
