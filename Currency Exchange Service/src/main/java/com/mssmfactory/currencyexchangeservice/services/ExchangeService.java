package com.mssmfactory.currencyexchangeservice.services;

import com.mssmfactory.currencyexchangeservice.dtos.ExchangeResponse;
import com.mssmfactory.currencyexchangeservice.exceptions.ExchangeNotFoundException;
import com.mssmfactory.currencyexchangeservice.factories.ExchangeResponseFactory;
import com.mssmfactory.currencyexchangeservice.models.Exchange;
import com.mssmfactory.currencyexchangeservice.repositories.ExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Currency;
import java.util.Optional;

@Service
public class ExchangeService {

    @Autowired
    private ExchangeRepository exchangeRepository;

    @Autowired
    private ExchangeResponseFactory exchangeResponseFactory;

    public ExchangeResponse findByFromAndTo(Currency from, Currency to) {
        Optional<Exchange> exchangeOptional = this.exchangeRepository.findFirstByFromAndTo(from, to);

        if (exchangeOptional.isPresent()) {
            Exchange exchange = exchangeOptional.get();
            ExchangeResponse exchangeResponse = this.exchangeResponseFactory.create(exchange);

            return exchangeResponse;
        } else throw new ExchangeNotFoundException();
    }
}