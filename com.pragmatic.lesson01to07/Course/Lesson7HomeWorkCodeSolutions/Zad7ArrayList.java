package Lesson7HomeWorkCodeSolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad7ArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter ArrayList size: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		System.out.println("Enter ArrayList's elements");
		List arrayList = new ArrayList<>();
		
		for (int i = 0; i < size; i++) {
			System.out.print("New value index["+i+"]: ");
			arrayList.add(sc.nextInt());	
		}
		
		System.out.println("Currently the ArrayList looks like: " + arrayList);

		List newArrayList = new ArrayList<>();
				
		for (int i = 0; i < size; i++) {
			if(i == 0){
				newArrayList.add(arrayList.get(1));
			}
			if(i == size - 1){
				newArrayList.add(i, arrayList.get(i-1)); 
			}
			if(i != 0 && i != size - 1 ){
				newArrayList.add(i, (int)arrayList.get(i-1) + (int)arrayList.get(i+1));
			}
		}

		System.out.println("The new array is: " + newArrayList);

	}

}
