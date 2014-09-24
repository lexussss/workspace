package Lesson7HomeWorkCodeSolutions;

import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		//create scanner
		Scanner sc = new Scanner(System.in);
		//create the array
		int size = 1;
		while(size % 2 != 0) {
			System.out.println("Enter even size for the array:");
			size = sc.nextInt();
		}
		
		int[] array = new int[size];
		for (int i = 0; i < array.length / 2; i++) {
			System.out.println("Enter value for the index " + i);
			array[i] = sc.nextInt();
			array[array.length / 2 + i] = array[i];
		}
		
		//print the array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
}
