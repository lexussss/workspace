//: c09:SimpleCollection.java
// A simple example using Java 2 Collections.
package lesson07;

import java.util.*;

public class SimpleCollection {
  public static void main(String[] args) {
    // Upcast because we just want to
    // work with Collection features
    Collection c = new ArrayList();

    for(int i = 0; i < 10; i++)
      c.add(Integer.toString(i));
    Iterator it = c.iterator();
    while(it.hasNext())
      System.out.println(it.next());
  }
} ///:~