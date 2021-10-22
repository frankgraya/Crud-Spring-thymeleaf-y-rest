package com.frank.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FrankcrudspringthymeleafApplication {

    @Value("${spring.application.name}")
    private String name;

    public static void main(String[] args) {
        SpringApplication.run(FrankcrudspringthymeleafApplication.class, args);
    }

    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public String name() {
        return name;
    }


}
