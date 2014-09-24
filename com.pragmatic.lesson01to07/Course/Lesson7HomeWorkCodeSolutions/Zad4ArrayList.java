package Lesson7HomeWorkCodeSolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad4ArrayList {

	public static void main(String[] args) {
		//create scanner
		Scanner sc = new Scanner(System.in);
		//create the array
		System.out.print("Enter size for the array: ");
		int size = sc.nextInt();
		
		//init the array
		List arrayList = new ArrayList<>();
		
		for (int i = 0; i < size; i++) {
			System.out.print("Enter value for the index [" + i + "]: ");
			arrayList.add(sc.nextInt());
		}
		
		//check if is mirror
		boolean isMirror = true;
		for (int i = 0; i < size / 2; i++) {
			if( arrayList.get(i) != arrayList.get(size - 1 - i)) {
				isMirror = false;
				break;
			}
		}
		
		if(isMirror) {
			System.out.println("The array is MIRROR");
		} else {
			System.out.println("The array is NOT mirror");
		}
	}
	
}
