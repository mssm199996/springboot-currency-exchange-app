package com.mssmfactory.currencyexchangeservice.factories;

import com.mssmfactory.currencyexchangeservice.dtos.EnvironmentExchangeResponse;
import com.mssmfactory.currencyexchangeservice.models.Exchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentExchangeFactory implements ExchangeResponseFactory<EnvironmentExchangeResponse> {

    @Autowired
    private Environment environment;

    @Override
    public EnvironmentExchangeResponse create(Exchange exchange) {
        String environment = this.environment.getProperty("local.server.port");

        EnvironmentExchangeResponse environmentExchangeResponse = new EnvironmentExchangeResponse();
        environmentExchangeResponse.setId(exchange.getId());
        environmentExchangeResponse.setFrom(exchange.getFrom());
        environmentExchangeResponse.setTo(exchange.getTo());
        environmentExchangeResponse.setRatio(exchange.getRatio());
        environmentExchangeResponse.setEnvironment(environment);

        return environmentExchangeResponse;
    }
}
