package lesson07;

public class ArrayCompare {
	public static void main(String[] args) {
		int[] array = {2, 3, 4, 100};
		int[] array2 = new int[4];
		array2[0] = 2;
		array2[1] = 3;
		array2[2] = 4;
		array2[3] = 10;
		
		
		//System.out.println(array == array2);
		
		boolean isEqual = true;
		for (int i = 0; i < array.length; i++) {
			if(array[i] != array2[i]) {
				isEqual = false;
				break;
			}
		}
		
		System.out.println("The arrays are equals:" + isEqual);
	}
}
