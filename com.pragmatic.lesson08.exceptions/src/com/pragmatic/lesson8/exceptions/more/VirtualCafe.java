package com.pragmatic.lesson8.exceptions.more;

public class VirtualCafe {

    public static void serveCustomer(VirtualPerson cust, CoffeeCup cup) {

        try {
            cust.drinkCoffee(cup);
            System.out.println("Coffee is just right.");
        }
        catch (TooColdException e) {
            int temperature = e.getTemperature();
            
            System.out.println("Coffee temperature is " + temperature + " degrees Celsius.");
            
            if (temperature > 55 && temperature <= 65) {
                System.out.println("Coffee is cooling off.");
                // Add more hot coffee...
            }
            else if (temperature > 0 && temperature <= 55) {
                System.out.println("Coffee is too cold.");
                // Give customer a new cup of coffee with the
                // proper temperature...
            }
            else if (temperature <= 0) {
                System.out.println("Coffee is frozen.");
                // Deal with an irate customer...
            }
        }
        catch (TooHotException e) {
            int temperature = e.getTemperature();
            System.out.println("Coffee temperature is " + temperature + " degrees Celsius.");
            if (temperature >= 85 && temperature < 100) {
                System.out.println("Coffee is too hot.");
                // Ask customer to let it cool a few minutes...
            }
            else if (temperature >= 100 && temperature < 2000) {
                System.out.println("Both coffee and customer are steamed.");
                // Deal with an irate customer...
            }
            else if (temperature >= 2000) {
                System.out.println("The coffee is plasma.");
                // Deal with a very irate customer...
            }
        }
    }
}