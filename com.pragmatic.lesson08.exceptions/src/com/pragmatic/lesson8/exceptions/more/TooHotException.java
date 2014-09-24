package com.pragmatic.lesson8.exceptions.more;

class TooHotException extends TemperatureException {

	public TooHotException(int temperature) {
		super(temperature);
	}

	private static final long serialVersionUID = -763916623202785228L;
	
}