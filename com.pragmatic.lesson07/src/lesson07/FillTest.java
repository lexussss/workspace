//: c09:FillTest.java
package lesson07;

import lesson07.com.bruceeckel.util.*;

import java.util.*;

public class FillTest {
  static Generator sg = new Arrays2.RandStringGenerator(7);
  
  public static void main(String[] args) {
    List list = new ArrayList();
    Collections2.fill(list, sg, 25);
    System.out.println("list => " + list + "\n");
    
    List list2 = new ArrayList();
    Collections2.fill(list2, 
      Collections2.capitals, 25);
    System.out.println("list2 => " + list2 + "\n");
    
    Set set = new HashSet();
    Collections2.fill(set, sg, 25);
    System.out.println("set => " + set + "\n");
    
    Map m = new HashMap();
    Collections2.fill(m, Collections2.rsp, 25);
    System.out.println("map m => " + m + "\n");
    
    Map m2 = new HashMap();
    Collections2.fill(m2, 
      Collections2.geography, 25);

    System.out.println("hashmap m2 => " + m2);
  }
} ///:~