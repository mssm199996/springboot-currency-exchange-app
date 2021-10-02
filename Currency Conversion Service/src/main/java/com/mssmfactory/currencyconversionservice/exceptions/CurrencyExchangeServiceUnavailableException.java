package com.mssmfactory.currencyconversionservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class CurrencyExchangeServiceUnavailableException extends RuntimeException {
}
