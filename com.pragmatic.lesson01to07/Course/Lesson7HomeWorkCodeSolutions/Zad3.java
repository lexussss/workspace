package Lesson7HomeWorkCodeSolutions;

import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		
		int[] mas = new int[10];
		mas[0] = n;
		mas[1] = n;
		
		//full the array after the second element
		for (int i = 2; i < mas.length; i++) {
			mas[i] = mas[i-2] + mas[i-1];
		}
		//print the array
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		
	}
	
}
