package com.example.study.controllers;

import com.example.study.entities.Currency;
import com.example.study.retrofit2.CallbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainRestController {

    @Autowired
    CallbackService callbackService;

    @GetMapping("/currencies")
    public List<Currency> getCurrency(){
        callbackService.start();
        return callbackService.getCurrencies();
    }

}

