package com.mailong245.tcdt.ecomerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.mailong245.tcdt.ecomerce.*")
public class EcomerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcomerceApplication.class, args);
    }

}
