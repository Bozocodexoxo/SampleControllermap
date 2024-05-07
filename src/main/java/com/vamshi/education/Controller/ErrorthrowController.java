package com.vamshi.education.Controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ErrorthrowController {
    Logger logger= LogManager.getLogger(ErrorthrowController.class);
    @ExceptionHandler(Exception.class)

    public ModelAndView exceptioncatch(Exception exception){
        logger.info("this is running");

        ModelAndView errorpage=new ModelAndView();
        logger.info("this is running");

        errorpage.setViewName("error");
        logger.info("this is running");
        errorpage.addObject("errorMessage",exception.getMessage());
        return errorpage;
    }
}
