package com.mssmfactory.currencyconversionservice.services;

import com.mssmfactory.currencyconversionservice.components.exchangeRatioProvider.ExchangeRatioProvider;
import com.mssmfactory.currencyconversionservice.dtos.responses.outgoing.ConversionResponse;
import com.mssmfactory.currencyconversionservice.exceptions.InvalidExchangeRatioException;
import com.mssmfactory.currencyconversionservice.factories.ConversionResponseFactory;
import com.mssmfactory.currencyconversionservice.models.ExchangeRatio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Currency;

@Service
public class ConversionService {

    @Autowired
    private ExchangeRatioProvider exchangeRatioProvider;

    @Autowired
    private ConversionResponseFactory conversionResponseFactory;

    public ConversionResponse compute(Currency from, Currency to, BigDecimal quantity) {
        ExchangeRatio ratio = this.exchangeRatioProvider.getRatio(from, to);

        if (ratio != null) {
            BigDecimal total = quantity.multiply(ratio.getRatio());

            return this.conversionResponseFactory.create(from, to, ratio, quantity, total);
        } else throw new InvalidExchangeRatioException();
    }
}
