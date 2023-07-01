package com.example.testservice2_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestService21Application {

    public static void main(String[] args) {
        SpringApplication.run(TestService21Application.class, args);
    }

}
