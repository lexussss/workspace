package lesson07; 

import java.util.*;

public final class IteratorExample {

  public static void main(String... aArguments) {
    List<String> flavours = new ArrayList<>();
    List<String> flavours2 = new ArrayList<>();
    flavours2.add("mint");
    flavours.add("chocolate");
    flavours.add("strawberry");
    flavours.add("vanilla");

    flavours.addAll(flavours2);
    useWhileLoop(flavours);
    System.out.println();
    useForLoop(flavours);
  }

  private static void useWhileLoop(Collection<String> aFlavours) {
    Iterator<String> flavoursIter = aFlavours.iterator();
    while (flavoursIter.hasNext()){
      System.out.println(flavoursIter.next());
    }
  }

  /**
  * Note that this for-loop does not use an integer index.
  */
  private static void useForLoop(Collection<String> aFlavours) {
    for (Iterator<String> flavoursIter = aFlavours.iterator(); flavoursIter.hasNext(); ){
      System.out.println(flavoursIter.next());
    }
  }
} 