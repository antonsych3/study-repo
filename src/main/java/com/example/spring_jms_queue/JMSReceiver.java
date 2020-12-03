package com.example.spring_jms_queue;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.listener.SessionAwareMessageListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

@Component
@Slf4j
public class JMSReceiver implements SessionAwareMessageListener<Message> {

    @Override
    public void onMessage(Message message, Session session) throws JMSException {
        TextMessage txtMessage = (TextMessage) message;
        log.info("JMS Text Message received: " + txtMessage.getText());
    }

}
