package Lesson7HomeWorkCodeSolutions;

import java.util.Scanner;

public class Zad6 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//first array
		System.out.println("Enter size for the first array:");
		int[] arrayFirst = new int[sc.nextInt()];
		for (int i = 0; i < arrayFirst.length; i++) {
			System.out.println("Enter value for element with index " + i);
			arrayFirst[i] = sc.nextInt();
		}
		
		//second array
		System.out.println("Enter size for the second array:");
		int[] arraySecond = new int[sc.nextInt()];
		for (int i = 0; i < arraySecond.length; i++) {
			System.out.println("Enter value for element with index " + i);
			arrayFirst[i] = sc.nextInt();
		}
		
		//compare
		if( arrayFirst.length != arraySecond.length) {
			System.out.println("The arrays have different length.");
		} else {
			boolean isEquals = true;
			for (int i = 0; i < arrayFirst.length; i++) {
				if(arrayFirst[i] != arraySecond[i]) {
					isEquals = false;
					break;
				}
			}
			if (isEquals) {
				System.out.println("The arrays are equals");
			} else {
				System.out.println("The arrays are not equals");
			}
		}
	}
}
