package com.example.thymeleafProject1.rest;



import com.example.thymeleafProject1.entity.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentRestController {

@RequestMapping("/showform")
    public  String studentForm(Model model){

    Student student=new Student();
    model.addAttribute("stud" ,student);

    return "form";
}
    @GetMapping("/viewform")

    public  String displayData(@ModelAttribute ("stud") Student studentData){
    return "viewformstud";

    }


}
