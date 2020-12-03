package com.example.spring_jms_queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.DefaultMessageListenerContainer;

import javax.jms.ConnectionFactory;
import javax.sql.DataSource;

@Configuration
@EnableJms
public class JmsConfiguration {

    @Value("${oracle.advanced.queue.name}")
    private String queueName;

    @Autowired
    ConnectionFactory connectionFactory;

    @Bean
    public JmsTemplate jmsTemplate() {
        JmsTemplate jmsTemplate = new JmsTemplate();

        jmsTemplate.setDefaultDestinationName(queueName);
        jmsTemplate.setSessionTransacted(true);
        jmsTemplate.setConnectionFactory(connectionFactory);
        return jmsTemplate;
    }

    @Bean
    @Autowired
    public DefaultMessageListenerContainer messageListenerContainer(DataSource dataSource, JMSReceiver jmsReceiver) {
        DefaultMessageListenerContainer dmlc = new DefaultMessageListenerContainer();
        DataSourceTransactionManager manager = new DataSourceTransactionManager();

        dmlc.setDestinationName(queueName);
        dmlc.setSessionTransacted(true);
        dmlc.setConnectionFactory(connectionFactory);
        manager.setDataSource(dataSource);
        dmlc.setTransactionManager(manager);
        dmlc.setMessageListener(jmsReceiver);
        return dmlc;
    }

}
