package com.pragmatic.lesson7.homework;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();

		int[] arrayTask3 = new int[10];
		int prev = 0;
		int next = n;
		int sum = 0;

		  for (int i = 0; i < 10; i++) {
	            sum = sum + next;
	            int prevTemp = prev;
	            prev = next;
	            next = prevTemp + next;
	            arrayTask3[i] = next;
	        }
		  
		  for (int i = 0; i < (arrayTask3.length); i++) {
				System.out.print(arrayTask3[i] + ", ");
			}
		
	}
}
