package introtocs.datastructures;

import java.util.Queue;
import java.util.LinkedList;

public class Queues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Working with Queue's
		Queue<String> line = new LinkedList<String>();
		line.add("Person 1");
		line.add("Person 2");
		line.add("Person 3");
		
		String person1 = line.remove();
		String person2 = line.remove();
		
		System.out.println(person1);
		System.out.println(person2);

	}

}
