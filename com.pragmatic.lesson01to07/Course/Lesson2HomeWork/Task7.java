package Lesson2HomeWork;

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.print(i + ", ");
			}
				}
	}

}
