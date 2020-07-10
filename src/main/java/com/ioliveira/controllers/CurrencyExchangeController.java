package com.ioliveira.controllers;

import com.ioliveira.entities.CurrencyExchange;
import com.ioliveira.services.CurrencyExchangeService;
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
    @Autowired
    private CurrencyExchangeService service;

    @GetMapping(path = "/{from}/{to}")
    public ResponseEntity<CurrencyExchange> getExchangeValue(@PathVariable String from, @PathVariable String to) {
        CurrencyExchange currencyExchange = service.getCurrency(from, to);
        currencyExchange.setPort(Integer.parseInt(Objects.requireNonNull(environment.getProperty("local.server.port"))));
        return ResponseEntity.ok(currencyExchange);
    }

}
