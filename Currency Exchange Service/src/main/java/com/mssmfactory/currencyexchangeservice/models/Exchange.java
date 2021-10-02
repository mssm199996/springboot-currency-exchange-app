package com.mssmfactory.currencyexchangeservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Currency;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Exchange {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "FROM_CURRENCY")
    private Currency from;

    @Column(name = "TO_CURRENCY")
    private Currency to;

    private BigDecimal ratio;
}
