package Lesson7HomeWorkCodeSolutions;

import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		//create scanner
		Scanner sc = new Scanner(System.in);
		//create the array
		System.out.println("Enter size for the array:");
		int size = sc.nextInt();
		int[] array = new int[size];
		
		//read the array from the console
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter value for the index " + i);
			array[i] = sc.nextInt();
		}
		//find the minimum number multiple by 3
		boolean hasNumberMultipleBy3 = false;
		int min = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if(array[i] % 3 == 0 && (min % 3 != 0 || array[i] < min)) {
				hasNumberMultipleBy3 = true;
				min = array[i];
			}
		}
		
		if(hasNumberMultipleBy3 == false && min % 3 != 0) {
			System.out.println("No number multiple by 3 in the array");
		} else {
			System.out.println("The minimum number multiple by 3 is " + min);
		}
	}
	
}
