package com.artu.application_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources(@PropertySource("classpath:/env.properties"))
public class ApplicationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationServerApplication.class, args);
    }

}
