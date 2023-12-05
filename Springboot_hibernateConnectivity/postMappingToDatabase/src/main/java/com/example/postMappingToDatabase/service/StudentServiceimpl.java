package com.example.postMappingToDatabase.service;



import com.example.postMappingToDatabase.dao.StudentDao;
import com.example.postMappingToDatabase.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceimpl implements StudentService{

    private StudentDao studentDao;

@Autowired
    public StudentServiceimpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> findAll() {
      return studentDao.findAll();
    }

    @Override
    public Student find(Integer rollno) {

    return studentDao.find(rollno);
    }

    @Override
    @Transactional
    public String saveRecord(Student student) {
    return studentDao.saveRecord(student);

    }

    @Override
    @Transactional
    public String updateRecord(Student student) {
     return studentDao.updateRecord(student);

    }

    @Override
    @Transactional
    public String deleteRecords(Integer rollno) {
        return studentDao.deleteRecords(rollno);
    }
}
