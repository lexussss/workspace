package introtocs.intermediate;

public class NestedLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Nested Loops
		String[] birds = { "Parrot", "Eagle", "Hawk" };
		String[] snakes = { "Rattlesnake", "Cobra", "Anaconda" };
		String[] bigcats = { "Lion", "Tiger", "Leopard" };
		
		String[][] zoo = { birds, snakes, bigcats };
		
		for (int i = 0; i < zoo.length; i++) {
			for (int j = 0; j < zoo[i].length; j++) {
				System.out.println(zoo[i][j]);
			}
		}

	}

}
