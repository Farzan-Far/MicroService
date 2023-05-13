package com.Farzan.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;


@SpringBootApplication(
        scanBasePackages = {
                "com.Farzan.client",
                "com.java.amqp"
        }
)
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.java.farzan")
@PropertySources({
        @PropertySource("classpath:feign-${spring.profiles.active}.properties")
})
public class ClientApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ClientApplication.class,args);
    }
}