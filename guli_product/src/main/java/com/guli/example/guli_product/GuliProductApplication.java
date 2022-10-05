package com.guli.example.guli_product;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GuliProductApplication {
    public static void main(String[] args){
        SpringApplication.run(GuliProductApplication.class, args);
    }
}
