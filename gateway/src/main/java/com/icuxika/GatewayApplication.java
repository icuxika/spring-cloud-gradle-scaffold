package com.icuxika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        System.out.println(Basic.hhh());
        SpringApplication.run(GatewayApplication.class, args);
    }

}
