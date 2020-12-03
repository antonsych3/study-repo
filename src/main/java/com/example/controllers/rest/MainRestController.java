//package com.example.controllers.rest;
//
//import com.example.rest_soap_rabbit.entities.Currency;
//import com.example.rest_soap_rabbit.retrofit2.CallbackService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class MainRestController {
//
//    private final CallbackService callbackService;
//
//    public MainRestController(CallbackService callbackService) {
//        this.callbackService = callbackService;
//    }
//
//    @GetMapping("/currencies")
//    public List<Currency> getCurrency(){
//        callbackService.start();
//        return callbackService.getCurrencies();
//    }
//
//}
//
