package com.pragmatic.lesson7.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task7Al {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		ArrayList<Integer> arrayTask7 = new ArrayList<Integer>();
		ArrayList<Integer> tempArray = new ArrayList<Integer>();
		
		int prev = 0;
		int next = 0;
		
				
		for (int i = 0; i < n; i++) {
			System.out.println("Enter array element " + i);
			arrayTask7.add(i, sc.nextInt());

		}

		for (int i = 0; i < n; i++) {
			prev = arrayTask7.get(i);
			next = arrayTask7.get(i+2);
			}
		
		for (int i = 0; i < n; i++) {
			tempArray.add(i, (prev + next));
		}
		for (int m : tempArray) {
			System.out.print(m + ", ");
		}

	}
}
