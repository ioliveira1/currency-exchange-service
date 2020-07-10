package com.ioliveira.services;

import com.ioliveira.entities.CurrencyExchange;
import com.ioliveira.repositories.CurrencyExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeService {

    @Autowired
    private CurrencyExchangeRepository repository;

    public CurrencyExchange getCurrency(String from, String to) {
        return repository.findByFromAndTo(from, to);
    }

}
