package com.example.rest_soap_rabbit.soaptest;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.addressing.client.ActionCallback;

import java.net.URISyntaxException;

public class SoapClientTest extends WebServiceGatewaySupport {

    public CreateSessionResponse getCreateSessionResponse(String user, String password) throws URISyntaxException {
        ObjectFactory objectFactory = new ObjectFactory();
        CreateSession request = new CreateSession();
        request.setUserName(objectFactory.createCreateSessionUserName(user));
        request.setUserPassword(objectFactory.createCreateSessionUserPassword(password));

        return (CreateSessionResponse) getWebServiceTemplate()
                .marshalSendAndReceive( request,
                        new ActionCallback("http://nat.kz/IService/CreateSession"));

    }
}
