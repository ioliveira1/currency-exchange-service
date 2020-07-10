package com.ioliveira.controllers;

import com.ioliveira.entities.CurrencyExchange;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/exchange")
public class CurrencyExchangeController {

    @GetMapping(path = "/{from}/{to}")
    public ResponseEntity<CurrencyExchange> getExchangeValue(@PathVariable String from, @PathVariable String to) {
        return ResponseEntity.ok(CurrencyExchange.builder().id(10L).from(from).to(to).conversionMultiple(65).build());
    }

}
