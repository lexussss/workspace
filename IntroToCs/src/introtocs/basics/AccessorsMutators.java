package introtocs.basics;
import java.awt.Rectangle;

public class AccessorsMutators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Working with Accessors and Mutators
		Rectangle rectangle = new Rectangle(20, 50);
		rectangle.grow(5, 10);
		System.out.println(rectangle.getWidth());
		System.out.println(rectangle.getHeight());

	}

}
