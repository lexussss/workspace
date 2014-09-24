//Въведете 3 различни чи�?ла от конзолата и ги разпечатайте в низход�?щ ред.

package Lesson1HomeWork;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {

		Scanner scannerA = new Scanner(System.in);
		System.out.println("Въведете �?:");
		int A = scannerA.nextInt();
		System.out.println("A = " + A);

		Scanner scannerB = new Scanner(System.in);
		System.out.println("Въведете B:");
		int B = scannerB.nextInt();
		System.out.println("B = " + B);

		Scanner scannerC = new Scanner(System.in);
		System.out.println("Въведете C:");
		int C = scannerB.nextInt();
		System.out.println("C = " + C);

		int position1 = 0;
		int position2 = 0;
		int position3 = 0;

		if (A < B && A < C) {
			position1 = A;
		} else if (A > B && A < C) {
			position2 = A;
		} else
			position3 = A;

		if (B < A && B < C) {
			position1 = B;
		} else if (B > A && B < C) {
			position2 = B;
		} else
			position3 = B;

		if (C < A && C < B) {
			position1 = C;
		} else if (C > A && C < B) {
			position2 = C;
		} else
			position3 = C;

		System.out.println(position3 + "," + position2 + "," + position1);


	}

}
