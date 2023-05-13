package com.java.farzan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication(
        scanBasePackages = {
                "com.java.farzan",
                "com.java.amqp"
        })
@PropertySources({
        @PropertySource("classpath:feign-${spring.profiles.active}.properties")
})
public class NotificationApplication 
{
    public static void main(String[] args)
    {
        SpringApplication.run(NotificationApplication.class,args);
    }
}