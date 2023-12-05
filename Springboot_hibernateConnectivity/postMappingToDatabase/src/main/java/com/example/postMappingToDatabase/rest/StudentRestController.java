package com.example.postMappingToDatabase.rest;



import com.example.postMappingToDatabase.entity.Student;
import com.example.postMappingToDatabase.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping ("/listStud")
public class

StudentRestController {
    private StudentService studentService;
@Autowired
    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public List<Student> getStudentList(){

        return  studentService.findAll();
    }
    @GetMapping("/student/{rollno}")
    public  Student getStudent(@PathVariable int rollno){

//        return studentService.findAll().get(studentId);
        return studentService.find(rollno);
    }
    @PostMapping("/student")
    public String saveRecordInTable(@RequestBody Student student){
    return  studentService.saveRecord(student);
    }
    @PutMapping("/studentUpdate")
    public String updateRecordInTable(@RequestBody  Student student){
    return studentService.updateRecord(student);
    }
    @DeleteMapping("/studentDelete/{rollno}")
    public String deleteRecordInTable(@PathVariable @RequestBody int rollno){
   return  studentService.deleteRecords(rollno);
    }

}
