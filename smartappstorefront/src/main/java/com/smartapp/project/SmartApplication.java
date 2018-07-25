package com.smartapp.project;

import com.smartapp.project.core.data.MessageData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SmartApplication.class);
        application.run(args);
    }

}
