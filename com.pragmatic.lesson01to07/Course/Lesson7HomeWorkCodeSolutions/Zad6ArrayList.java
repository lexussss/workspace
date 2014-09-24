package Lesson7HomeWorkCodeSolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad6ArrayList {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		List arrayList1 = new ArrayList<>();
		List arrayList2 = new ArrayList<>();
		
		// Lets fill values for arrayList1
		System.out.print("Put new value into the arrayList1(to stop write -> non-int value): ");
		while (sc1.hasNextInt()) {
			System.out.print("Put new value into the arrayList1(to stop write -> non-int value): ");
			int i = sc1.nextInt();
			arrayList1.add(i);
		}
		
		// Lets fill values for arrayList1
		System.out.print("arrayList2(to stop write -> non-int value): ");
		while (sc2.hasNextInt()) {
			System.out.print("arrayList2(to stop write -> non-int value): ");
			int i = sc2.nextInt();
			arrayList2.add(i);
		}

		if(arrayList1.equals(arrayList2)) {
			System.out.println("The two ArrayLists - arrayList1 and arrayList2 are EQUAL");
		} else {
			System.out.println("No they are NOT!");
		}
		
	}
}
