package com.example.postMappingToDatabase.rest;



import com.example.postMappingToDatabase.dao.AddressRepository;
import com.example.postMappingToDatabase.entity.Address;
import com.example.postMappingToDatabase.entity.Employee;
import com.example.postMappingToDatabase.service.AddressService;
import com.example.postMappingToDatabase.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping ("/api")
public class

EmplyeeRestController {
    private EmployeeService employeeService;
    @Autowired

    public EmplyeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employees")
    public Employee saveRecordInTable(@RequestBody Employee employee){

    return  employeeService.saveRecord(employee);

    }
//
    @GetMapping("/employees")
    public List<Employee > getStudentList(){
        return  employeeService.findAll();
    }
    @GetMapping("/employees/{rollno}")
    public  Employee getStudent(@PathVariable int rollno){
        return employeeService.find(rollno);
    }


    @PutMapping("/employees")
    public String updateRecordInTable(@RequestBody Employee employee){

    return employeeService.updateRecord(employee);
    }
    @DeleteMapping("/employees/{rollno}")
    public String deleteRecordInTable(@PathVariable @RequestBody int rollno){
   return  employeeService.deleteRecords(rollno);
    }


}
