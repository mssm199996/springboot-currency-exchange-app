package com.mssmfactory.currencyconversionservice.components.exchangeRatioProvider;

import com.mssmfactory.currencyconversionservice.models.ExchangeRatio;

import java.util.Currency;

public interface ExchangeRatioProvider {

    ExchangeRatio getRatio(Currency from, Currency to);
}
