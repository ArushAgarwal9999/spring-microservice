package com.example.microservice.currencyexchangeservice.Repository;

import com.example.microservice.currencyexchangeservice.Model.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Integer> {
    CurrencyExchange findByFromAndTo(String from , String to);

}
