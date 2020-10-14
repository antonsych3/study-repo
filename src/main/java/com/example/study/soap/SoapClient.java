package com.example.study.soap;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.BigInteger;

@Service
public class SoapClient {
    NumberConversion numberConversion = new NumberConversion();
    NumberConversionSoapType numberConversionSoapType = numberConversion.getNumberConversionSoap();

    public void goTest(){
        System.out.println(numberConversionSoapType.numberToDollars(BigDecimal.valueOf(23L)));
        System.out.println(numberConversionSoapType.numberToWords(BigInteger.valueOf(45L)));
    }
}
