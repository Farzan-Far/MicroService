package com.Farzan.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication(
        scanBasePackages = {
                "com.Farzan.client",
                "com.java.amqp"
        }
)
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.java.farzan")
public class ClientApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ClientApplication.class,args);
    }
}