package com.example.limits_serviceP5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping(value="/limits")
	public LimitsConfiguration retriveLimitsFromConfigurations()
	{
		return new LimitsConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}
}
