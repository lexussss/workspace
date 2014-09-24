/*
 * Да �?е изведат �?ъобщени�? към потребител�? и да �?е прочетат 2 чи�?ла от клавиатурата A и B (може да �?а �? плаваща запета�? – double). 
 * По�?ле да �?е прочете 3-то чи�?ло C и да �?е провери дали то е м/у A и B. Да �?е изведе подход�?що �?ъобщение за това дали C е между A и B. 
 */

package Lesson1HomeWork;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scannerA = new Scanner(System.in);
		System.out.println("Въведете �?:");
		double expectedFromKeyboardA = scannerA.nextDouble();
		System.out.println("A = " + expectedFromKeyboardA);

		Scanner scannerB = new Scanner(System.in);
		System.out.println("Въведете B:");
		double expectedFromKeyboardB = scannerB.nextDouble();
		System.out.println("B = " + expectedFromKeyboardB);

		Scanner scannerC = new Scanner(System.in);
		System.out.println("Въведете C:");
		double expectedFromKeyboardC = scannerC.nextDouble();
		System.out.println("C = " + expectedFromKeyboardC);

		if (expectedFromKeyboardA < expectedFromKeyboardB) {

		// Case 1: If A<B
			if ((expectedFromKeyboardC > expectedFromKeyboardA)
					&& (expectedFromKeyboardC < expectedFromKeyboardB)) {
				System.out.println("C е между A и B");
			} else {
				System.out.println("C не е между A и B");
			}
		}

		// Case 2: If A>B
		else {
			if ((expectedFromKeyboardC < expectedFromKeyboardA)
					&& (expectedFromKeyboardC > expectedFromKeyboardB)) {
				System.out.println("C е между A и B");
			} else {
				System.out.println("C не е между A и B");
			}

		}
	}

}
