/*
Въведете 2 различни целочи�?лени чи�?ла от конзолата. Запишете т�?хната �?ума,
разлика, произведение, о�?татък от деление и целочи�?лено деление в отделни
променливи и разпечатайте тези резултати в конзолата. Опитайте �?ъщото �? чи�?ла
�? плаваща запета�?.
 */

package Lesson1HomeWork;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scannerA = new Scanner(System.in);
		System.out.println("Въведете �?:");
		double expectedFromKeyboardA = scannerA.nextDouble();
		System.out.println("A = " + expectedFromKeyboardA);

		Scanner scannerB = new Scanner(System.in);
		System.out.println("Въведете B:");
		double expectedFromKeyboardB = scannerB.nextDouble();
		System.out.println("B = " + expectedFromKeyboardB);

		// A + B
		double Sum = (expectedFromKeyboardA + expectedFromKeyboardB);
		System.out.println("A + B = " + Sum);

		// A - B
		double Subtraction = (expectedFromKeyboardA - expectedFromKeyboardB);
		System.out.println("A - B = " + Subtraction);

		// A * B
		double Multiplication = (expectedFromKeyboardA * expectedFromKeyboardB);
		System.out.println("A * B = " + Multiplication);
		
		// A / B
		double Division = (expectedFromKeyboardA * expectedFromKeyboardB);
		System.out.println("A / B = " + Division);

		// A % B
		double Remainder = (expectedFromKeyboardA % expectedFromKeyboardB);
		System.out.println("A % B = " + Remainder);
		
	}
}
