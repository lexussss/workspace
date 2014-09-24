package Lesson7HomeWorkCodeSolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad2ArrayList {

	public static void main(String[] args) {
		//create scanner
		Scanner sc = new Scanner(System.in);
		//create the array
		int size = 1;
		while(size % 2 != 0) {
			System.out.print("Enter even size for the ArrayList: ");
			size = sc.nextInt();
		}

		//instantiate a new ArrayList
		List arrayList = new ArrayList<>();
		
		//filling values for half of the ArrayList
		int tmpInt;
		for (int i = 0; i < size / 2; i++) {
			System.out.print("Enter value for index ["+ i +"]: ");
			tmpInt = sc.nextInt();
			arrayList.add(tmpInt);
		}
		System.out.println("For now ArrayList looks like: " + arrayList);

		arrayList.addAll(size/2, arrayList);
		
		System.out.println("The final ArrayList is: " + arrayList);

	}
	
}
