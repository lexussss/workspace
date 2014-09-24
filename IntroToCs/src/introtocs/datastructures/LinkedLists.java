package introtocs.datastructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Working with LinkedLists
		LinkedList<String> gList = new LinkedList<String>();
		gList.add("Roast Beef");
		gList.add("Cheese");
		gList.add("Honey Wheat Bread");
		
		ListIterator<String> iter = gList.listIterator();
		
		if (iter.hasNext()) {
			iter.next();
			iter.add("Lettuce");
		}
		
		iter.next();
		iter.remove();
		
		for (String item: gList) {
			System.out.println(item+" ");
		}

	}

}
