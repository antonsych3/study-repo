package com.example.rest_soap_rabbit.soaptest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;

@Configuration
public class SoapConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.example.rest_soap_rabbit.soaptest");
        return marshaller;
    }

    @Bean
    public SaajSoapMessageFactory newSoapMessageFactory() throws SOAPException {
        MessageFactory msgFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
        return new SaajSoapMessageFactory(msgFactory);
    }

    @Bean
    public SoapClientTest soapClientTest(Jaxb2Marshaller marshaller, SaajSoapMessageFactory newSoapMessageFactory) throws Exception {
        SoapClientTest client = new SoapClientTest();
        client.setDefaultUri("http://localhost:2223/imex/api/v1");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        client.setMessageFactory(newSoapMessageFactory);
        client.afterPropertiesSet();
        return client;
    }

}