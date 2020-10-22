package com.example.spring_jms_queue;

import oracle.AQ.*;
import oracle.jdbc.pool.OracleDataSource;
import oracle.jms.AQjmsFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.JMSException;
import javax.jms.QueueConnectionFactory;
import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class OracleConfiguration {

    @Value("${spring.datasource.username}")
    private String user;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${oracle.advanced.queue.table}")
    private String queueTableName;
    @Value("${oracle.advanced.queue}")
    private String queueName;

    @Bean
    public DataSource dataSource() throws SQLException {
        OracleDataSource ds = new OracleDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setURL(url);
        ds.setImplicitCachingEnabled(true);
        ds.setFastConnectionFailoverEnabled(true);
        return ds;
    }

    @Bean
    public QueueConnectionFactory connectionFactory(DataSource dataSource) throws JMSException {
        return AQjmsFactory.getQueueConnectionFactory(dataSource);
    }

    @Bean
    public AQQueue aqQueue(DataSource dataSource) throws AQException, SQLException, ClassNotFoundException {
        Class.forName("oracle.AQ.AQOracleDriver");
        AQSession aqSession = AQDriverManager.createAQSession(dataSource.getConnection());
        AQQueueProperty queueProperty = new AQQueueProperty();
        AQQueueTable queueTable = aqSession.getQueueTable(user, queueTableName);
        AQQueue queue;

        if (queueTable == null) {
            AQQueueTableProperty queueTableProperty = new AQQueueTableProperty("SYS.AQ$_JMS_TEXT_MESSAGE");
            queueTableProperty.setMultiConsumer(false);
            queueTable = aqSession.createQueueTable(user, queueTableName, queueTableProperty);
            queue = aqSession.createQueue(queueTable, queueName, queueProperty);
            queue.start();
            return queue;

        }

        queue = aqSession.getQueue(user, queueName);
        queue.start();
        return queue;
    }
}
