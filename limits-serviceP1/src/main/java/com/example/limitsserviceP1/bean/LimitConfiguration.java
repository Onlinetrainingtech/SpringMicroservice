package com.example.limitsserviceP1.bean;

public class LimitConfiguration 
{
   private int annualsalary;
   private int monthsalary;
   
   protected LimitConfiguration()
   {
	   
   }

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

public LimitConfiguration(int annualsalary, int monthsalary) {
	super();
	this.annualsalary = annualsalary;
	this.monthsalary = monthsalary;
}


 
   
}
