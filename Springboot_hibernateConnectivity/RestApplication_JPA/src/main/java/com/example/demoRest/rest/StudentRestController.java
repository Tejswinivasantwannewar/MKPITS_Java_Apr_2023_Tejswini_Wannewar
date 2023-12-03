package com.example.demoRest.rest;

import com.example.demoRest.entity.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController

@RequestMapping ("/list")

public class StudentRestController {
    @GetMapping("/stud")
    public List<Student> getStudentList(){
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(1001,"Tejswini","kharabi","Nagpur"));
        studentList.add(new Student(1002,"Bhagyashree","mahal","wardha"));
        studentList.add(new Student(1003,"Anushree","Burdi","Pune"));
        return  studentList;

    }
    @GetMapping("/student/{studentId}")
    public  Student getStudent(@PathVariable int studentId){
        List<Student> students=new ArrayList<Student>();
        students.add(new Student(1001,"Tejswini","kharabi","Nagpur"));
        students.add(new Student(1002,"Bhagyashree","mahal","wardha"));
        students.add(new Student(1003,"Anushree","Burdi","Pune"));
        return students.get(studentId);

    }

}
