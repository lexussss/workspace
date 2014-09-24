package Lesson7HomeWorkCodeSolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad3ArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		
		List arrayList = new ArrayList<>();
		arrayList.add(n);
		arrayList.add(n);
		
		//full the array after the second element
		for (int i = 2; i < 10; i++) {
			arrayList.add(i, (int)arrayList.get(i-2) + (int)arrayList.get(i-1));
		}
		
		System.out.println("The result ArrayList is: " + arrayList);
		
	}
	
}
