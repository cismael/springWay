package com.myrdv.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.myrdv"})
public class MyrdvApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyrdvApplication.class, args);
    }
}
