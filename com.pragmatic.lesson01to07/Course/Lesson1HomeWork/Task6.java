/*
Въведете 3 чи�?ла от клавиатурата а1, а2 и а3. Разменете �?тойно�?тите им така, че 
а1 да има �?тойно�?тта на а2, 
а2 да има �?тойно�?тта на а3, а 
а3 да има �?тарата �?тойно�?т на а1.
 */

package Lesson1HomeWork;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
	
		Scanner scannera1 = new Scanner(System.in);
		System.out.println("Въведете a1:");
		double expectedFromKeyboarda1 = scannera1.nextDouble();
		System.out.println("a1 = " + expectedFromKeyboarda1);

		Scanner scannera2 = new Scanner(System.in);
		System.out.println("Въведете a2:");
		double expectedFromKeyboarda2 = scannera2.nextDouble();
		System.out.println("a2 = " + expectedFromKeyboarda2);
		
		Scanner scannera3 = new Scanner(System.in);
		System.out.println("Въведете a3:");
		double expectedFromKeyboarda3 = scannera3.nextDouble();
		System.out.println("a3 = " + expectedFromKeyboarda3);

		// Temporary variables of the values of a1, a2 and a3 		
		double tempValueOfa1 = expectedFromKeyboarda1;
		double tempValueOfa2 = expectedFromKeyboarda2;
		double tempValueOfa3 = expectedFromKeyboarda3;
		
		
		expectedFromKeyboarda1 = tempValueOfa2;
		System.out.println("След разм�?ната �?тойно�?тите на а1 и а2, новата �?тойно�?т на а1 = " + expectedFromKeyboarda1);
		
		expectedFromKeyboarda2 = tempValueOfa3;
		System.out.println("След разм�?ната �?тойно�?тите на а2 и а3, новата �?тойно�?т на а2 = " + expectedFromKeyboarda2);
		
		expectedFromKeyboarda3 = tempValueOfa1;
		System.out.println("След разм�?ната �?тойно�?тите на а3 и а1, новата �?тойно�?т на а3 = " + expectedFromKeyboarda3);
		
	}
}
