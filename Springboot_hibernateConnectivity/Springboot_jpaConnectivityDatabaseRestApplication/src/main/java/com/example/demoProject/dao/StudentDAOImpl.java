package com.example.demoProject.dao;

import com.example.demoProject.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{
    private EntityManager entityManager;

   @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
    entityManager.persist(student);

    }

    @Override
    public Student find(Integer rollno)
    {

        return entityManager.find(Student.class,rollno);
    }

    @Override
    @Transactional
    public void deleteRecords(Integer rollno) {
        Student student=entityManager.find(Student.class,rollno);
        entityManager.remove(student);
        System.out.println("record deleted");
    }

    @Override
    @Transactional
    public Student updateRecord(Student student) {
        return entityManager.merge(student);

    }

    @Override
    public List<Student> findAll() {
        TypedQuery <Student> typedQuery= entityManager.createQuery("from Student ",Student.class);
        return typedQuery.getResultList();
    }


}
