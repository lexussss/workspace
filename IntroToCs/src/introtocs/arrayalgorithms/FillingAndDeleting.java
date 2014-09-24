package introtocs.arrayalgorithms;

import java.util.Arrays;

public class FillingAndDeleting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Filling Arrays
		int[] oneThroughTen = new int[10];
		for (int i = 0; i < oneThroughTen.length; i++) {
			oneThroughTen[i] = i+1;
		}
		
		System.out.println(Arrays.toString(oneThroughTen));
		
		// Deleting Elements
		String[] names = { "John", "Mary", "Nancy", "Bob" };
		names[1] = names[names.length - 1];
		String[] newNames = new String[names.length - 1];
		
		for (int i = 0; i < newNames.length; i++) {
			newNames[i] = names[i];
		}
		
		System.out.println(Arrays.toString(newNames));

	}

}
