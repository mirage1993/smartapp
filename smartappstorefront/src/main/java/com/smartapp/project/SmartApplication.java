package com.smartapp.project;

import com.smartapp.project.core.data.MessageData;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SmartApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SmartApplication.class);
        application.run(args);
    }

}
