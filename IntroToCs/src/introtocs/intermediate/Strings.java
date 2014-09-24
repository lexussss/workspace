package introtocs.intermediate;

public class Strings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Working with Strings
		System.out.println("The scruffy dog said, \"WOOF WOOF\"");
		System.out.println("Transportation types: bike\\car\\airplane");
		
		String surprise = "Boo!";
		System.out.println(surprise.toLowerCase());
		System.out.println(surprise.toUpperCase());
		
		String trimThis = "   Trim This   ";
		System.out.println(trimThis.trim()+"String");
		
		String phrase = "I love to program";
		String substring = phrase.substring(2, 6);
		System.out.println(substring);
		String newPhrase = phrase.replace("program", "build applications");
		System.out.println(newPhrase);
		
		if (substring.equalsIgnoreCase("Love")) {
			System.out.println("The strings match");
		} else {
			System.out.println("The strings do NOT match");
		}
	}

}
