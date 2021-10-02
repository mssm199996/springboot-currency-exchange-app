package com.mssmfactory.currencyconversionservice.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfigurator {

    @Bean
    public RestTemplate buildRestTemplate() {
        RestTemplate template = new RestTemplate();

        return template;
    }
}
