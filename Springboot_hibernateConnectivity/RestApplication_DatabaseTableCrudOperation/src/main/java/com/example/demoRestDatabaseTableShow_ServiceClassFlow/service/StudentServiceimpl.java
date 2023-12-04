package com.example.demoRestDatabaseTableShow.service;


import com.example.demoRestDatabaseTableShow.dao.StudentDao;
import com.example.demoRestDatabaseTableShow.entity.Student;
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
}
