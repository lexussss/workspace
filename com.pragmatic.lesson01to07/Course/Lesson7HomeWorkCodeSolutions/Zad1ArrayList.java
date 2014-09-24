package Lesson7HomeWorkCodeSolutions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Zad1ArrayList {

	public static void main(String[] args) {
		//create scanner
		Scanner sc = new Scanner(System.in);
		//create the arraylist
		List arrayList = new ArrayList<>();

		//read the arraylist values from the console
		System.out.print("Put new value into the ArrayList(to stop write -> non-int value): ");
		while(sc.hasNextInt()) {
			System.out.print("Put new value into the ArrayList(to stop write -> non-int value): ");
			int i = sc.nextInt();
			arrayList.add(i);
		}
		System.out.println("The result ArrayList is: " + arrayList);
		
		//find the minimum number multiple by 3
		Iterator itr = arrayList.iterator();
		int min = (int)arrayList.get(0);
		boolean hasNumberMultipleBy3 = false;
		
		while(itr.hasNext()) {
			int tmpInt = (int)itr.next();
			if(tmpInt % 3 == 0 && (min % 3 != 0 || tmpInt < min)){
				hasNumberMultipleBy3 = true;
				min = tmpInt;
			}
		}
		
		if(hasNumberMultipleBy3 == false && (min % 3 != 0)) {
			System.out.println("No number multiple by 3 in the array");
		} else {
			System.out.println("The minimum number multiple by 3 is " + min);
		}
	}
	
}
