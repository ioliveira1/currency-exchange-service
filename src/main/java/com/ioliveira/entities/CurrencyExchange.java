package com.ioliveira.entities;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder(toBuilder = true)
@Entity
public class CurrencyExchange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Currency_from")
    private String from;

    @Column(name = "Currency_to")
    private String to;
    private Integer conversionMultiple;

    @Transient //Nao sera gravado no banco
    private int port;
}
