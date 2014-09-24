// Въведете 2 различни чи�?ла от конзолата и ги разпечатайте в нара�?тващ ред.

package Lesson1HomeWork;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {

		Scanner scannerA = new Scanner(System.in);
		System.out.println("Въведете �?:");
		int expectedFromKeyboardA = scannerA.nextInt();
		System.out.println("A = " + expectedFromKeyboardA);

		Scanner scannerB = new Scanner(System.in);
		System.out.println("Въведете B:");
		int expectedFromKeyboardB = scannerB.nextInt();
		System.out.println("B = " + expectedFromKeyboardB);

		if (expectedFromKeyboardA < expectedFromKeyboardB) {
			System.out.println("�? и Б в нара�?тващ ред = "
					+ expectedFromKeyboardA + ", " + expectedFromKeyboardB);
		} else
			System.out.println("�? и Б в нара�?тващ ред = "
					+ expectedFromKeyboardB + ", " + expectedFromKeyboardA);

		{
		}

	}
}
