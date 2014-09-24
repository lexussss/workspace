package com.pragmatic.lesson8.exceptions.more;

import java.util.ArrayList;
import java.util.List;

public class CoffeeDemo {

	public static void main(String[] args) {
		VirtualPerson person = new VirtualPerson();
		CoffeeCup coffee = new CoffeeCup();
		coffee.setTemperature(2222);
//
//		VirtualCafe.serveCustomer(person, coffee);
		//coffee.setTemperature(70);
		
		try {
			person.drinkCoffee(coffee);
			
			System.out.println("Coffee is great :)");
		} catch (TooColdException e) {
			
			System.out.println("Coffee is too cold");
			e.printStackTrace();
			System.out.println("Temp-a beshe tolkova: " + e.getTemperature());
		} catch (TooHotException e) {
			System.out.println("Coffee is too hot");
			e.printStackTrace();
			System.out.println("Temp-a beshe tolkova: " + e.getTemperature());

		}		
		
//	
//		List<String> list1 = new ArrayList<>();
//		List<CoffeeCup> list2 = new ArrayList<>();	
//		
//		
//		List rawList = new ArrayList<>();
//		rawList.add("stringche");
//		rawList.add(23);
//		
			//System.out.println("Do some more, dont stop the program, try drink more coffies :)");
	}

}
