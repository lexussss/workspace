//IceCream.java
//Returning arrays from methods.

package lesson07;

public class IceCream {
  static String[] flav = {
    "Chocolate", "Strawberry",
    "Vanilla Fudge Swirl", "Mint Chip",
    "Mocha Almond Fudge", "Rum Raisin",
    "Praline Cream", "Mud Pie" 
  };
  
  static String[] flavorSet(int n) {
    // Force it to be positive value & within bounds:
    n = Math.abs(n) % (flav.length + 1);
    System.out.println("n= " + n);
    String[] results = new String[n];
    boolean[] picked = 
      new boolean[flav.length];
    
    for (int i = 0; i < n; i++) {
      int t;
      //check if we already if such random choice has been added already to the results array
      do 
        t = (int)(Math.random() * flav.length);
      while (picked[t]);
      results[i] = flav[t];
      picked[t] = true;
    }
    return results;
  }
  
  public static void main(String[] args) {
    for(int i = 0; i < 20; i++) {
      System.out.println(
        "flavorSet(" + i + ") = ");
      String[] fl = flavorSet(flav.length);
      for(int j = 0; j < fl.length; j++)
        System.out.println("\t" + fl[j]);
    }
  }
} ///:~