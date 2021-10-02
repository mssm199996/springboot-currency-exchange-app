package com.mssmfactory.currencyexchangeservice.dtos;

import com.mssmfactory.currencyexchangeservice.models.Exchange;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnvironmentExchangeResponse extends Exchange implements ExchangeResponse {

    private String environment;
}
