package com.mssmfactory.currencyconversionservice.controllers;

import com.mssmfactory.currencyconversionservice.dtos.responses.outgoing.ConversionResponse;
import com.mssmfactory.currencyconversionservice.services.ConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Currency;

@RestController
@RequestMapping("conversions")
public class ConversionController {

    @Autowired
    private ConversionService conversionService;

    @GetMapping("{from}/{to}/{quantity}")
    public ConversionResponse compute(@PathVariable("from") Currency from, @PathVariable("to") Currency to, @PathVariable("quantity") BigDecimal quantity) {
        return this.conversionService.compute(from, to, quantity);
    }
}
