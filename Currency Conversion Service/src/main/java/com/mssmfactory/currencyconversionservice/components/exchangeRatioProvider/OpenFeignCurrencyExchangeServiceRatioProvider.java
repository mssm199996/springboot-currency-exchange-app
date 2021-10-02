package com.mssmfactory.currencyconversionservice.components.exchangeRatioProvider;

import com.mssmfactory.currencyconversionservice.models.ExchangeRatio;
import com.mssmfactory.currencyconversionservice.proxies.ExchangeRatioProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Currency;

@Component
public class OpenFeignCurrencyExchangeServiceRatioProvider implements ExchangeRatioProvider {

    @Autowired
    private ExchangeRatioProxy exchangeRatioProxy;

    @Override
    public ExchangeRatio getRatio(Currency from, Currency to) {
        return this.exchangeRatioProxy.findByFromAndTo(from, to);
    }
}
