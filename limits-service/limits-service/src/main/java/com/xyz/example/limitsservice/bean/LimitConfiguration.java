package com.xyz.example.limitsservice.bean;

public class LimitConfiguration
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
   
//no-argument constructor
   public LimitConfiguration()
   {
	   
   }
public LimitConfiguration(int maxvalue, int minvalue) {
	super();
	this.maxvalue = maxvalue;
	this.minvalue = minvalue;
}
   
   //genetrating cons using fields
   
   
}
