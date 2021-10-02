package com.mssmfactory.currencyexchangeservice.factories;

import com.mssmfactory.currencyexchangeservice.dtos.ExchangeResponse;
import com.mssmfactory.currencyexchangeservice.models.Exchange;

public interface ExchangeResponseFactory<T extends ExchangeResponse> {

    T create(Exchange exchange);
}
