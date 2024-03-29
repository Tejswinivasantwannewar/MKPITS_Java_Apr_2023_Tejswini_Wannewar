package com.example.demoRestDatabaseTableShow.dao;


import com.example.demoRestDatabaseTableShow.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentDaoImpl implements  StudentDao{
    private EntityManager entityManager;
@Autowired
    public StudentDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findAll() {
    TypedQuery <Student> typedQuery= entityManager.createQuery("from Student",Student.class);
    return  typedQuery.getResultList();
    }

    @Override
    public Student find(Integer rollno) {
  Student student= entityManager.find(Student.class,rollno);
  return  student;
    }
}
