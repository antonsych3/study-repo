//package com.example.controllers;
//
//import com.example.rest_soap_rabbit.retrofit2.CallbackService;
//import com.example.rest_soap_rabbit.soap.SoapClient;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jms.core.JmsTemplate;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import javax.xml.soap.SOAPException;
//
//@Controller
//public class MainController {
//
//    @Autowired
//    CallbackService callbackService;
//
//    @Autowired
//    SoapClient soapClient;
//
//
//    @Autowired
//    JmsTemplate jmsTemplate;
//
//    @GetMapping("/")
//    public String index() {
//        jmsTemplate.convertAndSend("AQ_QUEUE1", "My message");
//        callbackService.start();
//        soapClient.goTest();
//        jmsTemplate.convertAndSend("AQ_QUEUE1", "New message after pause!!!!");
//        return "index";
//    }
//}
