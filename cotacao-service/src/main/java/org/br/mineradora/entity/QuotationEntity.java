package org.br.mineradora.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table( name = "quotation" )
@Data
@NoArgsConstructor
public class QuotationEntity {
    @Id
    @SequenceGenerator(name = "quotationSeq", sequenceName = "quotation_id_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "quotationSeq")
    private Long id;
    @Column( name = "quote_date" )
    private Date quoteDate;
    @Column( name = "currency_price" )
    private BigDecimal currencyPrice;
    @Column( name = "pct_change" )
    private String pctChange;
    private String pair;
}
