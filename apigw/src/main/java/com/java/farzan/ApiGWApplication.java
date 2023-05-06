package com.java.farzan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ApiGWApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ApiGWApplication.class,args);
    }

    // TODO: 06/05/2023  complete the application.yml with the UPDATE DELETE FIND and....
}