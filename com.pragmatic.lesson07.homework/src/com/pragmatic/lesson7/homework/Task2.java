package com.pragmatic.lesson7.homework;

import java.util.Scanner;
import java.util.Arrays;


public class Task2 {

	public static void main(String[] args) {
		int[] arrayTask2 = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter arrays size devidable by 2: ");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			arrayTask2 = new int[n];

			for (int i = 0; i < (arrayTask2.length / 2); i++) {
				System.out.println("Enter array element " + i);
				arrayTask2[i] = sc.nextInt();
			}
			
			int[] tempArray = Arrays.copyOf(arrayTask2, (arrayTask2.length / 2));
			
			System.arraycopy(tempArray, 0, arrayTask2, (arrayTask2.length / 2), tempArray.length);
			
			for (int i = 0; i < (arrayTask2.length); i++) {
				System.out.print(arrayTask2[i] + ", ");
			}

		} else {
			System.out.println("Error!");
		}

	}
}
