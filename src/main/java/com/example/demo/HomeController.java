package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class HomeController {
    @GetMapping("/employeeinfo")
    public String loadFormPage(Model model){
        model.addAttribute("employeeinfo", new Employeeinfo());
        return "employeeinfo";
    }
    @PostMapping("/employeeinfo")
    public String loadFromPage(@ModelAttribute Employeeinfo employeeinfo, Model model) {
        model.addAttribute("employeeinfo", employeeinfo);
        return "confirmemployeeinfo";
    }
}