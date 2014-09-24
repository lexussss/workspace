//: c09:Set1.java
// Things you can do with Sets.
package lesson07;

import java.util.*;

import lesson07.com.bruceeckel.util.*;

public class Set1 {
  static Collections2.StringGenerator gen = Collections2.countries;
  
  public static void testVisual(Set a) {
    Collections2.fill(a, gen.reset(), 8);    
    Collections2.fill(a, gen.reset(), 8);    
    Collections2.fill(a, gen.reset(), 8);    
    System.out.println(a); // No duplicates!
    
    // Add another set to this one:
    a.addAll(a);
    a.add("one"); 
    a.add("one"); 
    a.add("one");
    System.out.println(a);
    
    // Look something up:
    System.out.println("a.contains(\"one\"): " + a.contains("one"));
  }
  public static void main(String[] args) {
    System.out.println("-----------------------------------------HashSet--------------------------------------------------");
    testVisual(new HashSet());
    
    System.out.println("-----------------------------------------TreeSet--------------------------------------------------");
    testVisual(new TreeSet());
  }
} ///:~