package com.pragmatic.lesson7.homework;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array #1 size: ");
		int n = sc.nextInt();
		int[] arrayTask6a = new int[n];

		for (int i = 0; i < arrayTask6a.length; i++) {
			System.out.println("Enter array element " + i);
			arrayTask6a[i] = sc.nextInt();
		}

		System.out.println("Enter array #2 size: ");
		int o = sc.nextInt();
		int[] arrayTask6b = new int[o];

		for (int i = 0; i < arrayTask6b.length; i++) {
			System.out.println("Enter array element " + i);
			arrayTask6b[i] = sc.nextInt();
		}

		boolean isEqual = true;
		boolean isEqualLenght = false;
		if (arrayTask6a.length == arrayTask6b.length) {
			isEqualLenght = true;
			for (int i = 0; i < arrayTask6a.length; i++) {
				if (arrayTask6a[i] != arrayTask6b[i]) {
					isEqual = false;
				}
			}
		}
		System.out.println("Lenght of the arrays is equal: " + isEqualLenght);
		System.out.println("Values of the arrays are equal: " + isEqual);

	}

}
