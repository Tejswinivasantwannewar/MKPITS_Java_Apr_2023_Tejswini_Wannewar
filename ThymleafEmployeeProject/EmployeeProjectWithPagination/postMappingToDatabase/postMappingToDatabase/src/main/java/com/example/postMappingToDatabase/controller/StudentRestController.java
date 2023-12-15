package com.example.postMappingToDatabase.controller;



import com.example.postMappingToDatabase.model.Employee;
import com.example.postMappingToDatabase.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller

public class StudentRestController {
    private EmployeeService employeeService;

    @Autowired
    public StudentRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

//
//    @GetMapping("/list")
//    public String viewHomePage(Model model) {
//        model.addAttribute("allemplist", employeeService.getAllEmployee());
//        return "index";
//    }

    @GetMapping("/addnewemployees")
    public String addNewEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "newemployee";
    }


    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        return "redirect:/list";
    }

    @GetMapping("/showFormForUpdate/{emp_id}")
    public String updateForm(@PathVariable(value = "emp_id") Integer emp_id, Model model) {
        Employee employee = employeeService.updatebyid(emp_id);
        model.addAttribute("employee", employee);
        return "updateemployee";
    }

    @GetMapping("/deleteEmployee/{emp_id}")
    public String deleteThroughId(@PathVariable(value = "emp_id") Integer emp_id) {
        employeeService.deleteempdatabyId(emp_id);
        return "redirect:/list";

    }

    @GetMapping("/list")
    public String viewHomePage(@PageableDefault(size = 5) Pageable pageable, Model model) {
//        model.addAttribute("allemplist", employeeService.getAllEmployee(pageable));
        Page<Employee> page = employeeService.getAllEmployee(pageable);
        model.addAttribute("page", page);
        return "index";
    }
}