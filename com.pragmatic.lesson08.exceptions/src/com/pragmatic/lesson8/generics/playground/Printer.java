package com.pragmatic.lesson8.generics.playground;

import java.util.ArrayList;
import java.util.List;


public class Printer<T> {
	
	private T cartridge;

	Printer(T cartridge) { 
		this.cartridge = cartridge;
	}
	
	public T getCartridge() {
		return cartridge;
	}
	
	public static void main(String[] args) {
		Printer<BlackWhiteCartridge> printer1 = new Printer<>(new BlackWhiteCartridge());
		Printer<ColorCartridge> printer2 = new Printer<>(new ColorCartridge());

		
		printOne(printer1);
		printOne(printer2);
		
		List<Integer> bla = new ArrayList();
		
		
	}
	
	public static void printOne(Printer<? extends ICartridge> printer) {
		printer.getCartridge().getFillPercentage();
	}
}
