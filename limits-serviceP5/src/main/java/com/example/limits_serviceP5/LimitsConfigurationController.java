package com.example.limits_serviceP5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class LimitsConfigurationController {

	@GetMapping
	public LimitsConfiguration retriveLimitsFromConfigurations()
	{
		return new LimitsConfiguration(1000,1);
	}
}
