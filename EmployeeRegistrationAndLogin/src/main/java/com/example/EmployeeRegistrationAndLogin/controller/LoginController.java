package com.example.EmployeeRegistrationAndLogin.controller;

import com.example.EmployeeRegistrationAndLogin.model.Employee;
import com.example.EmployeeRegistrationAndLogin.service.EmployeeService;
import jakarta.servlet.http.HttpSession;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller

public class LoginController {
    @Autowired
    private EmployeeService employeeService;

    public LoginController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "login";
    }

    @PostMapping("/login")
    public String login(Employee employee, HttpSession  httpSession) {
        String loginId = employee.getLoginId();
        String password = employee.getEmployeePassword();
        if (employeeService.validateLogin(loginId, password)) {
            String employeeName = employeeService.getEmployeeName(loginId);

            // Store the user's name in the session
            httpSession.setAttribute("empName", employeeName);
            // Successful login, redirect to some success page
            return "redirect:/loginSuccess";
        } else {
            // Invalid credentials, redirect back to login page with an error message
            return "redirect:/login?error";
        }
    }

    @GetMapping("/loginSuccess")
    public String loginSuccess() {
        // Logic for what to do after successful login
        return "loginSuccess";
    }
}
