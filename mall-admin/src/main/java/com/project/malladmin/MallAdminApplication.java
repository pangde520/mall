package com.project.malladmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.project.malladmin.mapper")
public class MallAdminApplication {


    public static void main(String[] args) {
        SpringApplication.run(MallAdminApplication.class, args);
    }

}
