package com.example.EmployeeRegistrationAndLogin.controller;

import com.example.EmployeeRegistrationAndLogin.model.Employee;
import com.example.EmployeeRegistrationAndLogin.service.EmployeeService;
import jakarta.servlet.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/registration")
    public String showRegistrationForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "registration";
    }

    @PostMapping("/register")
    public String registerEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.registerEmployee(employee);
        return "redirect:/registrationSuccess";
    }

    @GetMapping("/registrationSuccess")
    public String registrationSuccess() {
        return "registrationSuccess";
    }
    @GetMapping("/registration-list")
    public String showRegistrationList(Model model) {
        List<Employee> employeeList = employeeService.getAllEmployees();
        model.addAttribute("employeeList", employeeList);
        return "registrationlist";
    }
    @GetMapping("/update")
    public String updateEmployee(){
        return "hiii";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
        return "redirect:/registration-list";
    }

}
