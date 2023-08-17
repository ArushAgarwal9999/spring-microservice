package com.example.microservice.currencyexchangeservice.Controller;


import com.example.microservice.currencyexchangeservice.Model.CurrencyExchange;
import com.example.microservice.currencyexchangeservice.Service.CurrencyExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
    @Autowired
    CurrencyExchangeService currencyExchangeService;
    @Autowired
    Environment environment;

    @GetMapping(path = "currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange getCurrencyExchange(@PathVariable String from, @PathVariable String to)
    {
        CurrencyExchange currencyExchange = currencyExchangeService.getCurrencyExchange(from, to);
        currencyExchange.setEnvironment(environment.getProperty("local.server.port"));
        return currencyExchange;

    }
}
