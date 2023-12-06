package com.example.postMappingToDatabase.service;



import com.example.postMappingToDatabase.dao.StudentRepository;
import com.example.postMappingToDatabase.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceimpl implements StudentService{

  private StudentRepository studentRepository;
@Autowired
    public StudentServiceimpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    public List<Student> findAll() {
      return studentRepository.findAll();
    }

    @Override
    public Student find(Integer rollno) {
        Optional <Student> studentOptional=studentRepository.findById(rollno);
    return studentOptional.get();
    }

    @Override
    @Transactional
    public String saveRecord(Student student) {
     studentRepository.save(student);
        return "data save successfully";

    }

    @Override
    @Transactional
    public String updateRecord(Student student) {
    Optional<Student> studentOptional= studentRepository.findById(student.getRollno());
    if (studentOptional.isPresent()){

        studentRepository.save(student);
        return "Data updated succesfully";
    }
    else
    return "data cannot updated";
//        Student student1=studentRepository.findById(rollno).get()

////       Student student=optional.get();
//        System.out.println(student1);





    }

    @Override
    @Transactional
    public String deleteRecords(Integer rollno) {

     studentRepository.deleteById(rollno);
     return "Data deleted Successfulyy............!!!";
    }
}
