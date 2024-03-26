package com.vamshi.education.Controller;

import com.vamshi.education.Model.Student;
import com.vamshi.education.Service.studentservice;
import jakarta.validation.Valid;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ContactController {
Logger logger= LogManager.getLogger();
    studentservice sservice;
@Autowired
    public ContactController(studentservice sservice) {
        this.sservice = sservice;
    }

    @GetMapping("/contact")
    public String contactdetails(Model model) {
        model.addAttribute("student", new Student());
        return "contact";
    }
    @PostMapping("/saveMsg")
    public String saveMessage(@Valid @ModelAttribute Student student, Errors error){
    if(error.hasErrors()){
        logger.info("please enter correct details");
        return "/contacts";
    }

    sservice.save(student);

        return "redirect:/contact";
    }
}