package com.telusko.simpleWebApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to Telusko!";
    }

    @RequestMapping("/about")
    public String about(){
        return "We dont teach , We Educate!!";
    }
}
