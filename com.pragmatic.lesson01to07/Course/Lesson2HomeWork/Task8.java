package Lesson2HomeWork;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n:");
		int maxRow = sc.nextInt();

		int col = maxRow - 1;
		int number = 1;

		while (col <= number) {
			System.out.print(number);
			col++;
		}

	}
}
