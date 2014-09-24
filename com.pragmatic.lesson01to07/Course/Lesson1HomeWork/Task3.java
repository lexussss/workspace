/*
Въведете 2 различни чи�?ла от конзолата и разменте �?тойно�?тта им. Разпечатайте новите �?тойно�?ти
 */

package Lesson1HomeWork;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
	
		Scanner scannerA = new Scanner(System.in);
		System.out.println("Въведете �?:");
		double expectedFromKeyboardA = scannerA.nextDouble();
		System.out.println("A = " + expectedFromKeyboardA);

		Scanner scannerB = new Scanner(System.in);
		System.out.println("Въведете B:");
		double expectedFromKeyboardB = scannerB.nextDouble();
		System.out.println("B = " + expectedFromKeyboardB);

		// Temporary variables of the values of A and B 		
		double tempValueOfA = expectedFromKeyboardA;
		double tempValueOfB = expectedFromKeyboardB;
		
		
		expectedFromKeyboardA = tempValueOfB;
		System.out.println("След разм�?ната, �?тойно�?тта на A = " + expectedFromKeyboardA);
		
		expectedFromKeyboardB = tempValueOfA;
		System.out.println("След разм�?ната, �?тойно�?тта на B = " + expectedFromKeyboardB);
						
	}
}
