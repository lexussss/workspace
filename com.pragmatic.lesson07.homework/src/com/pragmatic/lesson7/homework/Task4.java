package com.pragmatic.lesson7.homework;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter arrays size: ");
		int n = sc.nextInt();
		int[] arrayTask4 = new int[n];

		for (int i = 0; i < arrayTask4.length; i++) {
			System.out.println("Enter array element " + i);
			arrayTask4[i] = sc.nextInt();
		}

		boolean isEqual = false;
		for (int i = 0; i < arrayTask4.length; i++) {

			if (arrayTask4[i] == arrayTask4[arrayTask4.length - 1 - i]) {
				isEqual = true;
			}
		}
		System.out.println("The array is mirror: " + isEqual);
	}
}