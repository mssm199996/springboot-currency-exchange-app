package com.mssmfactory.currencyexchangeservice.configs;

import com.mssmfactory.currencyexchangeservice.models.Exchange;
import com.mssmfactory.currencyexchangeservice.repositories.ExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;

@Configuration
public class InitialDataConfig {

    @Autowired
    private ExchangeRepository exchangeRepository;

    @PostConstruct
    private void onInitDatabase() {
        Exchange e1 = new Exchange();
        e1.setFrom(Currency.getInstance("USD"));
        e1.setTo(Currency.getInstance("EUR"));
        e1.setRatio(BigDecimal.valueOf(0.96));

        Exchange e2 = new Exchange();
        e2.setFrom(Currency.getInstance("EUR"));
        e2.setTo(Currency.getInstance("USD"));
        e2.setRatio(BigDecimal.valueOf(1.15));

        Exchange e3 = new Exchange();
        e3.setFrom(Currency.getInstance("USD"));
        e3.setTo(Currency.getInstance("DZD"));
        e3.setRatio(BigDecimal.valueOf(165.54));

        Exchange e4 = new Exchange();
        e4.setFrom(Currency.getInstance("EUR"));
        e4.setTo(Currency.getInstance("DZD"));
        e4.setRatio(BigDecimal.valueOf(210.12));

        this.exchangeRepository.saveAll(Arrays.asList(e1, e2, e3, e4));
    }
}
