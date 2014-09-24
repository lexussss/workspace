package Lesson2HomeWork;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter m:");
		int m = sc.nextInt();

		int sum = 0;
		int i = 0;

		while (i < m){
			i++;
			sum = sum + i;
			
		}
		System.out.print("The sum of all of the numbers between 1 and m = " + sum);
		
	}

}
