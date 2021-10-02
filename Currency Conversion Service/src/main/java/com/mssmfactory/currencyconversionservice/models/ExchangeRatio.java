package com.mssmfactory.currencyconversionservice.models;

import java.math.BigDecimal;

public interface ExchangeRatio {

    Long getId();

    BigDecimal getRatio();

    String getEnvironment();
}
