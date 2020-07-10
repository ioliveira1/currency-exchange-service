package com.ioliveira.entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder(toBuilder = true)
public class CurrencyExchange {
    private Long id;
    private String from;
    private String to;
    private Integer conversionMultiple;
}
