package com.mssmfactory.currencyexchangeservice.repositories;

import com.mssmfactory.currencyexchangeservice.models.Exchange;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Currency;
import java.util.Optional;

public interface ExchangeRepository extends JpaRepository<Exchange, Long> {

    Optional<Exchange> findFirstByFromAndTo(Currency from, Currency to);
}
