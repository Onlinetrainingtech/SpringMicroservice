package com.example.currencyexchangeserviceP1;

import java.math.BigDecimal;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CurrencyExchangeController 
{
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from,@PathVariable String to)//from map usd to INR
    {
    	return new ExchangeValue(1000L,from,to,BigDecimal.valueOf(65));
    }
    
}
