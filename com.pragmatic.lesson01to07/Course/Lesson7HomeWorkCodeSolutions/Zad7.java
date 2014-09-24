package Lesson7HomeWorkCodeSolutions;

import java.util.Scanner;

public class Zad7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter size: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Enter array's elements");

		int[] array = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		int[] array_new = new int[n];
		
		for (int i = 0; i < array_new.length; i++) {
			if(i == 0){
				array_new[0] = array[1];
			}
			if(i == array_new.length - 1){
				array_new[i] = array[i - 1]; 
			}
			if(i != 0 && i != array_new.length - 1 ){
				array_new[i] = array[i - 1] + array[i + 1];
			}
		}

		System.out.print("The new array is: {");
		for (int i = 0; i < array_new.length; i++) {
			System.out.print(array_new[i] + " ");
		}
		System.out.print("}");

	}

}
