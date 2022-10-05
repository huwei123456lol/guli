package com.guli.example.guli_conpon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GuliConponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliConponApplication.class, args);
    }



}
