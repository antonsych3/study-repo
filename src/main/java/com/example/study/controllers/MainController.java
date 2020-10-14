package com.example.study.controllers;

import com.example.study.retrofit2.CallbackService;
import com.example.study.soap.SoapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    CallbackService callbackService;

    @Autowired
    SoapClient soapClient;

    @GetMapping("/")
    public String index(){
        callbackService.start();
        soapClient.goTest();
        return "index";
    }
}
