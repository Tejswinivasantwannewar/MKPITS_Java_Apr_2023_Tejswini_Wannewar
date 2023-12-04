package com.example.demoRestDatabaseTableShow.rest;


import com.example.demoRestDatabaseTableShow.entity.Student;
import com.example.demoRestDatabaseTableShow.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping ("/list")
public class

StudentRestController {
    private StudentService studentService;
@Autowired
    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/stud1")
    public List<Student> getStudentList(){

        return  studentService.findAll();
    }
    @GetMapping("/student/{rollno}")
    public  Student getStudent(@PathVariable int rollno){

//        return studentService.findAll().get(studentId);
        return studentService.find(rollno);
    }

}
