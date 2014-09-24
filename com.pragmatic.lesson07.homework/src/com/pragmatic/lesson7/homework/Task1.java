package com.pragmatic.lesson7.homework;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter arrays size: ");
		int n = sc.nextInt();
		int[] arrayTask1 = new int[n];

		for (int i = 0; i < arrayTask1.length; i++) {
			System.out.println("Enter array element " + i);
			arrayTask1[i] = sc.nextInt();
		}

		int minValue = 0;

		boolean isDevidable = false;
		for (int i = 1; i < arrayTask1.length; i++) {
			if (arrayTask1[i] % 3 == 0) {
				minValue = arrayTask1[i];
				isDevidable = true;
				if (arrayTask1[i] < minValue) {
					minValue = arrayTask1[i];
				}
			}
		}

		if (isDevidable == true) {
			System.out.println("Lower numeber divisible by 3 is: " + minValue);
		} else {
			System.out.println("Error");

		}
	}

}
