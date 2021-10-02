package com.mssmfactory.currencyexchangeservice.controllers;

import com.mssmfactory.currencyexchangeservice.dtos.ExchangeResponse;
import com.mssmfactory.currencyexchangeservice.services.ExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Currency;

@RestController
@RequestMapping("exchanges")
public class ExchangeController {

    @Autowired
    private ExchangeService exchangeService;

    @GetMapping("{from}/{to}")
    public ExchangeResponse findByFromAndTo(@PathVariable("from") Currency from, @PathVariable("to") Currency to) {
        return this.exchangeService.findByFromAndTo(from, to);
    }
}
