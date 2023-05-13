package com.java.farzan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@EnableEurekaClient
@PropertySources({
        @PropertySource("classpath:feign-${spring.profiles.active}.properties")
})
public class CheckApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(CheckApplication.class, args);
    }
}