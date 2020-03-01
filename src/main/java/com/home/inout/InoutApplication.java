package com.home.inout;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Stack;

@SpringBootApplication
@MapperScan("com.home.inout.mapper")
public class InoutApplication {

    public static void main(String[] args) {
        SpringApplication.run(InoutApplication.class, args);
    }

}
