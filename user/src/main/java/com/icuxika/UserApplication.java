package com.icuxika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {
        System.out.println(Basic.hhh());
        SpringApplication.run(UserApplication.class, args);
    }

}