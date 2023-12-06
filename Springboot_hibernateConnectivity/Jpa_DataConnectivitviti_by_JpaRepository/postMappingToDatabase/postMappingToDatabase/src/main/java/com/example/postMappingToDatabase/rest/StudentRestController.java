package com.example.postMappingToDatabase.rest;



import com.example.postMappingToDatabase.entity.Student;
import com.example.postMappingToDatabase.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping ("/api")
public class

StudentRestController {
    private StudentService studentService;
@Autowired
    public StudentRestController(StudentService studentService) {

    this.studentService = studentService;
    }
//
    @GetMapping("/students")
    public List<Student> getStudentList(){

        return  studentService.findAll();
    }
    @GetMapping("/students/{rollno}")
    public  Student getStudent(@PathVariable int rollno){

//        return studentService.findAll().get(studentId);
        return studentService.find(rollno);
    }
    @PostMapping("/students")
    public String saveRecordInTable(@RequestBody Student student){

    return  studentService.saveRecord(student);
    }
    @PutMapping("/students")
    public String updateRecordInTable( @RequestBody  Student student){

    return studentService.updateRecord(student);
    }
    @DeleteMapping("/students/{rollno}")
    public String deleteRecordInTable(@PathVariable @RequestBody int rollno){
   return  studentService.deleteRecords(rollno);
    }

}
