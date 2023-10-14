package com.example.currencyexchangeserviceP1;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;  
@SpringBootApplication
@RestController
public class CurrencyExchangeController 
{
	@Autowired  
	private ExchangeValueRepository repository;  
//	@GetMapping("/currency-exchange/from/{from}/to/{to}")
//    public ExchangeValue retrieveExchangeValue(@PathVariable String from,@PathVariable String to)//from map usd to INR
//    {
//    	return new ExchangeValue(1000L,from,to,BigDecimal.valueOf(65));
//    }
	@Autowired  
	private Environment environment;  
//	@Autowired  
//	private ExchangeValueRepository repository;  
	@GetMapping("/currency-exchange/from/{from}/to/{to}")       //where {from} and {to} are path variable  
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to)   //from map to USD and to map to INR  
	{         
	ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);  
	//setting the port  
	exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));  
	return exchangeValue;  
	}  
    
}
