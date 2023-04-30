package com.java.farzan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {
                "com.java.farzan.notification",
                "com.java.amqp"
        })
public class NotificationApplication 
{
    public static void main(String[] args)
    {
        SpringApplication.run(NotificationApplication.class,args);
    }
}