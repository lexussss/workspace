package Lesson2HomeWork;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter m:");
		int m = sc.nextInt();

		System.out.println("Enter n:");
		int n = sc.nextInt();

		if (m < n) {
			do {
				System.out.println(m);
				m++;
			} while (m <= n);

		}
		else 
			do {
				System.out.println(n);
				n++;
			} while (n <= m);
		
	}
}
