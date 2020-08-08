package com.wb.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.wb.springcloud.client")
public class ApplicationFeign {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationFeign.class);
    }
}
