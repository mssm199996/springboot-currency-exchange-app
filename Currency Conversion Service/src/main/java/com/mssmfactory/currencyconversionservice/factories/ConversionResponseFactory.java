package com.mssmfactory.currencyconversionservice.factories;

import com.mssmfactory.currencyconversionservice.dtos.responses.outgoing.ConversionResponse;
import com.mssmfactory.currencyconversionservice.models.ExchangeRatio;

import java.math.BigDecimal;
import java.util.Currency;

public interface ConversionResponseFactory {

    public ConversionResponse create(Currency from, Currency to, ExchangeRatio exchangeRatio, BigDecimal quantity, BigDecimal total);
}
