package com.llz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.llz.dao")
@EnableEurekaClient
public class LlzDemo2SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(LlzDemo2SpringbootApplication.class, args);
    }

}
