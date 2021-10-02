package com.mssmfactory.currencyconversionservice.proxies;

import com.mssmfactory.currencyconversionservice.dtos.responses.ingoing.ExchangeRatioResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Currency;

@FeignClient(name = "currency-exchange-service")
@RequestMapping("exchanges")
public interface ExchangeRatioProxy {

    @GetMapping("{from}/{to}")
    ExchangeRatioResponse findByFromAndTo(@PathVariable("from") Currency from, @PathVariable("to") Currency to);
}
