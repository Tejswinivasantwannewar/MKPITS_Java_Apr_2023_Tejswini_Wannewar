package com.example.postMappingToDatabase.rest;

import com.example.postMappingToDatabase.entity.Address;
import com.example.postMappingToDatabase.entity.Courses;
import com.example.postMappingToDatabase.entity.Employee;
import com.example.postMappingToDatabase.service.CourseService;
import com.example.postMappingToDatabase.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CourseRestController {
    private EmployeeService employeeService;


    private CourseService courseService;
@Autowired
    public CourseRestController(EmployeeService employeeService, CourseService courseService) {
        this.employeeService = employeeService;
        this.courseService = courseService;
    }

    @PostMapping("/courses")
public String save(@RequestBody Employee employee){
//        Address ad=new Address("pune","44102");
//        System.out.println(ad);
//        Employee employee1=new Employee(102,"teju",ad);
//        List<Courses> list=new ArrayList<Courses>();
//       Courses courses=new Courses("dot net");
//       Courses courses1=new Courses("python");
//       list.add(courses);
//       list.add(courses1);
//        System.out.println(list);
//      employee1.setCourses(list);

      employeeService.saveRecord(employee);
      return "save course successfully";
    }
}
