package com.example.microservice.currencyexchangeservice.Service;


import com.example.microservice.currencyexchangeservice.Model.CurrencyExchange;
import com.example.microservice.currencyexchangeservice.Repository.CurrencyExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CurrencyExchangeService {
    @Autowired
    CurrencyExchangeRepository currencyExchangeRepository;


    public CurrencyExchange getCurrencyExchange(String from , String to)
    {
        CurrencyExchange currencyExchange = currencyExchangeRepository.findByFromAndTo(from,to);
        if(currencyExchange == null)
                throw  new RuntimeException("Invalid currency");
        return currencyExchange;

    }
}
