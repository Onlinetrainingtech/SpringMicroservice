package com.example.limitsserviceP1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.limitsserviceP1.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController 
{
     @Autowired
	
	private Configuration configuration;
   @GetMapping("/employee")
   public LimitConfiguration retriveLimitsFromConfigurations()
   {
	   
	
	//return new LimitConfiguration(200000,10000);
	
	return new LimitConfiguration(configuration.getAnnualsalary(),configuration.getMonthsalary());
	   
   }
}
