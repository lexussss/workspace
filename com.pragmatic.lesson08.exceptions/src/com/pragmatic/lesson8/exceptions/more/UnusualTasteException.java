package com.pragmatic.lesson8.exceptions.more;

public class UnusualTasteException extends Exception {

	private static final long serialVersionUID = 3227074004958104199L;

	UnusualTasteException() {
    
	}
    
	UnusualTasteException(String msg) {
        super(msg);
    }
}