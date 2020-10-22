package com.example.spring_jms_queue;

import oracle.AQ.AQQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.listener.SessionAwareMessageListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

@Component
public class JMSReceiver implements SessionAwareMessageListener<Message> {
    private static final Logger logger = LoggerFactory.getLogger(JMSReceiver.class);

    @Autowired
    AQQueue aqQueue;

    @Override
    public void onMessage(Message message, Session session) throws JMSException {
        TextMessage txtMessage = (TextMessage) message;
        logger.info("JMS Text Message received: " + txtMessage.getText());
    }

}
