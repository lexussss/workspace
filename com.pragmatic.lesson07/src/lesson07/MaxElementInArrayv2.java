package lesson07;

import java.util.Scanner;

public class MaxElementInArrayv2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter value:");
			arr[i] = sc.nextInt();
		}
		
		
		int indexOfTheMaxElement = 0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > arr[indexOfTheMaxElement]) {
				indexOfTheMaxElement = i;
			}
		}
		
		System.out.println("The max element is " + arr[indexOfTheMaxElement]);
	}
}
