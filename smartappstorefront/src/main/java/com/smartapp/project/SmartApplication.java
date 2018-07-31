package com.smartapp.project;

import com.smartapp.project.util.SpringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SmartApplication {

    private static Logger logger = LoggerFactory.getLogger(SmartApplication.class);

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SmartApplication.class);
        ApplicationContext applicationContext = application.run(args);
        SpringUtils.create().setApplicationContext(applicationContext);
        logger.info("the smart app is running...");
    }

}
