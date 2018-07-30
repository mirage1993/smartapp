package com.smartapp.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableTransactionManagement
public class SmartApplication {

    private static Logger logger = LoggerFactory.getLogger(SmartApplication.class);

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SmartApplication.class);
        application.run(args);
        logger.info("the smart app is running...");
    }

}
