package com.pragmatic.lesson7.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Task3Al {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		ArrayList<Integer> arrayTask3 = new ArrayList<Integer>();
		int prev = 0;
		int next = n;
		int sum = 0;
		
		for (int i = 0; i < 10; i++) {
			sum = sum + next;
            int prevTemp = prev;
            prev = next;
            next = prevTemp + next;
			arrayTask3.add(i, next);
		}
		
		for (int i : arrayTask3){
			System.out.print(i + ", ");
		}

	}
}
