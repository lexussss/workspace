package introtocs.controlflow;

public class IfStatements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Working with if, else if, and else statements
		int number = 18;
		
		if (number == 0 || number == 15) {
			System.out.println("The number variable is equal to 0 or 15");
		} else if (number > 20 && number < 50) {
			System.out.println("The number variable is between 20 and 50");
		} else {
			System.out.println("The number variable doesn't match the above conditions");
		}

	}

}
