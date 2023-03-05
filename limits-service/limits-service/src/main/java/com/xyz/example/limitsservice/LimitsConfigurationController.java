package com.xyz.example.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.example.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController 
{
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
    public LimitConfiguration retriveLimitsFromConfigurations()
    {
    	//return new LimitConfiguration(2000,10);
		
		return new LimitConfiguration(configuration.getMaxvalue(),configuration.getMinvalue());
    }
}
