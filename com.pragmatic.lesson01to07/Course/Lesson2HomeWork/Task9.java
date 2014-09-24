package Lesson2HomeWork;

import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A:");
		int a = sc.nextInt();

		System.out.println("Enter B:");
		int b = sc.nextInt();

		if (a > b) {
			int buf = a;
			a = b;
			b = buf;
		}

		do {
			int i = a * a;
			if (a % 3 == 0)
				System.out.print("skip" + a + ", ");
			else 
			System.out.print(i + ", ");
			a++;
		} while (a <= 200);

	}
}