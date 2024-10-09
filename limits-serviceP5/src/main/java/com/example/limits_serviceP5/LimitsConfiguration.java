package com.example.limits_serviceP5;

public class LimitsConfiguration {

	private int maximum;
	private int minimum;
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	
	protected LimitsConfiguration()
	{
		
	}
	public LimitsConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
	
}
