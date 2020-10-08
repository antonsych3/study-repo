package com.example.study.controllers;

import com.example.study.retrofit2.CallbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    CallbackService callbackService;

    @GetMapping("/")
    public String index(){
        callbackService.start();
        return "index";
    }
}
