package com.mssmfactory.currencyconversionservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Currency;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Conversion {

    private Long id;
    private Currency from, to;
    private BigDecimal ratio, quantity, total;
}
