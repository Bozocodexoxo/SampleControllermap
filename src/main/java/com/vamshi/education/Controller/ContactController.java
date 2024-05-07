package com.vamshi.education.Controller;

import com.vamshi.education.Service.studentservice;
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

@Controller
public class ContactController {
    Logger logger = LogManager.getLogger();
    private final studentservice sservice;

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
    public String saveMessage(@Valid @ModelAttribute Student student, Errors errors, Model model) {


        try {
            sservice.save(student);
            logger.info("Student data saved successfully");
            return "redirect:/contact";
        } catch (Exception e) {
            logger.error("Error occurred while saving student: " + e.getMessage());
            e.printStackTrace(); // Log the stack trace of the exception
            model.addAttribute("errorMessage", "An error occurred while saving the student. Please try again later.");
            return "contact"; // Return the contact form
        }
    }}
