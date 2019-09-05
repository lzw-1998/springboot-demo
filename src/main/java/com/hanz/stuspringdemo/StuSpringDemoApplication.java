package com.hanz.stuspringdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hanz.stuspringdemo")
public class StuSpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StuSpringDemoApplication.class, args);
    }

}
