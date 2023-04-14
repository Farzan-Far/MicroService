package com.Farzan.client.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ClientConfig
{
    @Bean
    public RestTemplate template()
    {
        return new RestTemplate();
    }
}
