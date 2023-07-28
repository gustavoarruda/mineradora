package org.br.mineradora.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table( name = "proposal" )
@Data
@NoArgsConstructor
public class ProposalEntity {
    @Id
    @SequenceGenerator(name = "proposalSeq", sequenceName = "proposal_id_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "proposalSeq")
    private Long id;

    private String customer;

    @Column( name = "price_tonne" )
    private BigDecimal priceTonne;

    private Integer tonnes;
    private String Country;

    @Column( name = "proposal_validity_days" )
    private Integer proposalValidityDays;

    @Column( name = "created_at" )
    private Date createdAt;
}
