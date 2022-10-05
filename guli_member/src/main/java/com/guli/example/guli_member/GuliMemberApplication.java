package com.guli.example.guli_member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/***
 * 调用远程方法的步骤
 * 1)引入open-feign
 * 2)编写一个接口，告诉springCloud这个接口调用远程服务
 * 3)声明接口的每一个方法都是调用哪一个服务的哪一个请求
 * 4)开启远程调用功能
 */

@EnableFeignClients(basePackages = "com.guli.example.guli_member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GuliMemberApplication {

    public static void main(String[] args){
        SpringApplication.run(GuliMemberApplication.class, args);
    }
}
