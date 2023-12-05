package com.example.postMappingToDatabase.dao;





import com.example.postMappingToDatabase.entity.Student;

import java.util.List;

public interface StudentDao {
    List<Student> findAll();
    Student find(Integer rollno);
    public  String saveRecord(Student student);
    public String updateRecord(Student student);
    public String deleteRecords(Integer rollno);
}
