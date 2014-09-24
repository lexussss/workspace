package com.pragmatic.lesson8.exceptions.more;

class TooColdException extends TemperatureException {

	public TooColdException(int temperature) {
		super(temperature);
	}

	private static final long serialVersionUID = 991219224009036422L;
}