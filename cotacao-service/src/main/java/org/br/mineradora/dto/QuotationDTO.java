package org.br.mineradora.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Jacksonized
@Builder
@AllArgsConstructor
public class QuotationDTO {
    private Date currencyPriceDate;
    private BigDecimal currencyPrice;
}
