package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexHandler {

    @RequestMapping("index")
    public String getIndex(){
        return "index";
    }
}
