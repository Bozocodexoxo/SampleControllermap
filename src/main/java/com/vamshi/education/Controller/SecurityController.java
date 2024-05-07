package com.vamshi.education.Controller;

import com.vamshi.education.Model.User;
import com.vamshi.education.repo.Userdb;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecurityController {
    @Autowired
    Userdb userdb;
    @GetMapping("/accountc")
    public String Webaccount(){
        return "accountc";
    }
    @GetMapping("/login")
    public String loginaccount( ){
        return "login";
    }
}
