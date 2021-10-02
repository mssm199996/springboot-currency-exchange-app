package com.mssmfactory.currencyconversionservice.components.exchangeRatioProvider;

import com.mssmfactory.currencyconversionservice.dtos.responses.ingoing.ExchangeRatioResponse;
import com.mssmfactory.currencyconversionservice.exceptions.CurrencyExchangeServiceUnavailableException;
import com.mssmfactory.currencyconversionservice.models.ExchangeRatio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

public class RestTemplateCurrencyExchangeServiceRatioProvider implements ExchangeRatioProvider {

    private final String remoteServiceEndpoint = "http://localhost:8000/exchanges/{from}/{to}/";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ExchangeRatio getRatio(Currency from, Currency to) {
        Map<String, Object> params = new HashMap<>();
        params.put("from", from);
        params.put("to", to);

        ResponseEntity<ExchangeRatioResponse> exchangeRatioResponseResponseEntity = this.restTemplate.getForEntity(this.remoteServiceEndpoint, ExchangeRatioResponse.class, params);

        if (exchangeRatioResponseResponseEntity.hasBody()) {
            ExchangeRatio exchangeRatio = exchangeRatioResponseResponseEntity.getBody();

            return exchangeRatio;
        } else throw new CurrencyExchangeServiceUnavailableException();
    }
}
