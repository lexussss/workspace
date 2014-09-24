package com.pragmatic.lesson8.exceptions.more;

public class TemperatureException extends Exception {

	private static final long serialVersionUID = 7370875021605431708L;
	
	private int temperature; // in Celsius
    
    public TemperatureException(int temperature) {
        this.temperature = temperature;
    }
    
    public int getTemperature() {
        return temperature;
    }
}