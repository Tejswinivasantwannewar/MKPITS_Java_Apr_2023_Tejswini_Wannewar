package com.example.thymeleafProject1.rest;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StudentRestController {

@RequestMapping("/showform")
    public  String studentForm(){

    return "form";
}
@GetMapping("/viewform")
public  String displayData(HttpServletRequest httpServletRequest,Model model){

    String stud_rollno= httpServletRequest.getParameter("roll_no");
    String stud_Name= httpServletRequest.getParameter("name");
    String stud_Address= httpServletRequest.getParameter("address");
    String stud_city= httpServletRequest.getParameter("city");

    model.addAttribute("roll_number",stud_rollno);
    model.addAttribute("name_stud",stud_Name);
    model.addAttribute("address_stud",stud_Address);
    model.addAttribute("city_stud",stud_city);
    return "viewformstud";
}

}
