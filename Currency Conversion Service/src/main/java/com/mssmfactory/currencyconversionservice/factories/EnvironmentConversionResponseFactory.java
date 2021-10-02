package com.mssmfactory.currencyconversionservice.factories;

import com.mssmfactory.currencyconversionservice.dtos.responses.outgoing.ConversionResponse;
import com.mssmfactory.currencyconversionservice.dtos.responses.outgoing.EnvironmentConversionResponse;
import com.mssmfactory.currencyconversionservice.models.ExchangeRatio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Currency;

@Component
public class EnvironmentConversionResponseFactory implements ConversionResponseFactory {

    @Autowired
    private Environment environment;

    @Override
    public ConversionResponse create(Currency from, Currency to, ExchangeRatio exchangeRatio, BigDecimal quantity, BigDecimal total) {
        String environment = this.environment.getProperty("local.server.port");

        EnvironmentConversionResponse environmentConversionResponse = new EnvironmentConversionResponse();
        environmentConversionResponse.setId(exchangeRatio.getId());
        environmentConversionResponse.setFrom(from);
        environmentConversionResponse.setRatio(exchangeRatio.getRatio());
        environmentConversionResponse.setTo(to);
        environmentConversionResponse.setQuantity(quantity);
        environmentConversionResponse.setTotal(total);
        environmentConversionResponse.setEnvironment(exchangeRatio.getEnvironment() + ":" + environment);

        return environmentConversionResponse;
    }
}
