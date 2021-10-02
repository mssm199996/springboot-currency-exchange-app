package com.mssmfactory.currencyconversionservice.dtos.responses.ingoing;

import com.mssmfactory.currencyconversionservice.models.ExchangeRatio;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ExchangeRatioResponse implements ExchangeRatio {

    private Long id;
    private BigDecimal ratio;
    private String environment;
}
