package com.xyz.example.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component

@ConfigurationProperties("limits-service")
public class Configuration 
{
   private int maxvalue;
   private int minvalue;
public int getMaxvalue() {
	return maxvalue;
}
public void setMaxvalue(int maxvalue) {
	this.maxvalue = maxvalue;
}
public int getMinvalue() {
	return minvalue;
}
public void setMinvalue(int minvalue) {
	this.minvalue = minvalue;
}
   
   
}
