package com.pragmatic.lesson8.exceptions.trycatch;

import com.pragmatic.lesson8.exceptions.more.CoffeeCup;
import com.pragmatic.lesson8.exceptions.more.VirtualCafe;
import com.pragmatic.lesson8.exceptions.more.VirtualPerson;

/* As an example, consider a program that requires one argument on the command line, a string that can be parsed into an integer.
 *  When you have a String and want an int, you can invoke the parseInt() method of the Integer class. If the string you pass represents an integer,
 *   parseInt() will return the value. If the string doesn't represent an integer, parseInt() throws NumberFormatException.
 *    Here is how you might parse an int from a command-line argument:
 */

public class Example1 {
		    public static void main(String[] args) {

		        int temperature = 0;
		        if (args.length > 0) {
		            try {
		                temperature = Integer.parseInt(args[0]);
		            }
		            catch(NumberFormatException e) {
		                System.out.println("Must enter integer as first argument.");
		                return;
		            }
		        }
		        else {
		            System.out.println("Must enter temperature as first argument.");
		            return;
		        }

		        // Create a new coffee cup and set the temperature of
		        // its coffee.
		        CoffeeCup cup = new CoffeeCup();
		        cup.setTemperature(temperature);

		        // Create and serve a virtual customer.
		        VirtualPerson cust = new VirtualPerson();
		        VirtualCafe.serveCustomer(cust, cup);
		
		    }
		}