package Lesson7HomeWorkCodeSolutions;

import java.util.Scanner;

public class Zad4 {

	public static void main(String[] args) {
		//create scanner
		Scanner sc = new Scanner(System.in);
		//create the array
		System.out.println("Enter size for the array:");
		int size = sc.nextInt();
		
		//init the array
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter value for the index " + i);
			array[i] = sc.nextInt();
		}
		
		//check if is mirror
		boolean isMirror = true;
		for (int i = 0; i < array.length / 2; i++) {
			if( array[i] != array[array.length - 1 - i]) {
				isMirror = false;
				break;
			}
		}
		
		if(isMirror) {
			System.out.println("The array is mirror");
		} else {
			System.out.println("The array is not mirror");
		}
	}
	
}
