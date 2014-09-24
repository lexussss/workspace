package com.pragmatic.lesson7.homework;

import java.util.*;

public class Task1_Al {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter arrays size: ");
		int n = sc.nextInt();
		ArrayList<Integer> arrayTask1 = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter array element " + i);
			arrayTask1.add(i, sc.nextInt());
		}

		boolean isDevidable = false;
		int minValue = 0;
		for (int i : arrayTask1) {
			if (i % 3 == 0) {
				minValue = i;
				isDevidable = true;
				if (i < minValue) {
					minValue = i;
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
