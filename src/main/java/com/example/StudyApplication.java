package com.example;

import com.example.rest_soap_rabbit.soaptest.SoapClientTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(SoapClientTest soapClientTest) {
        return args -> {
            System.out.println(soapClientTest
                    .getCreateSessionResponse("User", "Password")
                    .getCreateSessionResult()
            .getValue());
        };
    }

}
