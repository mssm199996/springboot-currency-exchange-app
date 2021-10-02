package com.mssmfactory.currencyconversionservice.dtos.responses.outgoing;

import com.mssmfactory.currencyconversionservice.models.Conversion;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnvironmentConversionResponse extends Conversion implements ConversionResponse {

    private String environment;
}
