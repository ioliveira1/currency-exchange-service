package com.ioliveira.controllers;

import com.ioliveira.entities.CurrencyExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping(path = "/exchange")
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;

    @GetMapping(path = "/{from}/{to}")
    public ResponseEntity<CurrencyExchange> getExchangeValue(@PathVariable String from, @PathVariable String to) {
        CurrencyExchange exchange = CurrencyExchange
                .builder()
                .id(10L)
                .from(from)
                .to(to)
                .conversionMultiple(65)
                .port(Integer.parseInt(Objects.requireNonNull(environment.getProperty("local.server.port"))))
                .build();

        return ResponseEntity.ok(exchange);
    }

}
