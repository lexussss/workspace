package lesson07;

import java.util.HashSet;
import java.util.Set;

public class MyTestClass {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("mint");
		s.add("chocolate");
		s.add("mint");
		s.add("bannana");
		
		for (String currentString : s) {
			System.out.println(s);
		}
	}

}
