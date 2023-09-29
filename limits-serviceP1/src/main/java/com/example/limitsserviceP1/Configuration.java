package com.example.limitsserviceP1;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("employee-service")
public class Configuration 
{
   private int annualsalary;
   private int monthsalary;
public int getAnnualsalary() {
	return annualsalary;
}
public void setAnnualsalary(int annualsalary) {
	this.annualsalary = annualsalary;
}
public int getMonthsalary() {
	return monthsalary;
}
public void setMonthsalary(int monthsalary) {
	this.monthsalary = monthsalary;
}
   
   
}
