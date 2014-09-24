package com.pragmatic.lesson7.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2Al {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter arrays size devidable by 2: ");
		int n = sc.nextInt();
		ArrayList<Integer> arrayTask2 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		
		if (n % 2 == 0) {
			for (int i = 0; i < n/2; i++) {
				System.out.println("Enter array element " + i);
				arrayTask2.add(i, sc.nextInt());
			}
			
			list2 = arrayTask2; 
			list2.addAll(arrayTask2);
			
		}else {
			System.out.println("Error!");
		}

		for (int i : list2){
			System.out.print(i + ", ");
		}
		
}
}