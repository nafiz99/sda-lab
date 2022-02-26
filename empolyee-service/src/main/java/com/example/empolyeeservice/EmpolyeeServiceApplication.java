package com.example.empolyeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmpolyeeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpolyeeServiceApplication.class, args);
    }

}
