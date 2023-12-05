package com.example.postMappingToDatabase.service;





import com.example.postMappingToDatabase.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    Student find(Integer rollno);

    public String saveRecord(Student student);
    public String updateRecord(Student student);
    public String deleteRecords(Integer rollno);
}
