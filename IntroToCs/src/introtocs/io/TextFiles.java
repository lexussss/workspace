package introtocs.io;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Working with Text Files
		File file = new File("/Users/andrewperkins/Java/IntroToCs/src/introtocs/io/text.txt");
		
		try {
			PrintWriter out = new PrintWriter(file);
			Scanner in = new Scanner(file);
			
			try {
				out.println("This is the new line 1");
				out.println("This is the new line 2");
				out.println("This is the new line 3");
				out.println("This is the new line 4");
			} finally {
				out.close();
			}
			
			try {
				String contents = in.nextLine();
				
				while (in.hasNextLine()) {
					contents = contents + "\n" + in.nextLine();
				}
				
				System.out.println(contents);
			} finally {
				in.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
