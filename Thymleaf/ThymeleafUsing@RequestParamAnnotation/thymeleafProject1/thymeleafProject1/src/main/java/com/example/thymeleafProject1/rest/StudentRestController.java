package com.example.thymeleafProject1.rest;



import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class StudentRestController {

@RequestMapping("/showform")
    public  String studentForm(){

    return "form";
}
    @GetMapping("/viewform")
    public  String displayData(@RequestParam ("roll_no") int stud_rollno,
                               @RequestParam("name") String stud_Name,
                               @RequestParam("address") String stud_Address,
                               @RequestParam ("city") String stud_city,Model model){



        model.addAttribute("roll_number",stud_rollno);
        model.addAttribute("name_stud",stud_Name);
        model.addAttribute("address_stud",stud_Address);
        model.addAttribute("city_stud",stud_city);

        return "viewformstud";
    }


}
