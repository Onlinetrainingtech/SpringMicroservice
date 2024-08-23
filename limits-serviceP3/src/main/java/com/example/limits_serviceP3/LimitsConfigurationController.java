package com.example.limits_serviceP3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

	@GetMapping("/limits")
	public LimitsConfiguration retriveLimitsFromConfigurations()
	{
		return new LimitsConfiguration(1000,1);
	}
}
