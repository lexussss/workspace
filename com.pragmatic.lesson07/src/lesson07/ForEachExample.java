package lesson07;

import java.util.*;
import java.math.BigDecimal;

public final class ForEachExample {

  public static void main(String... aArgs){
    ArrayList<Number> numbers = new ArrayList<Number>();
    numbers.add(new Integer(42));
    numbers.add(new Integer(-30));
    numbers.add(new BigDecimal("654.2"));

    //typical for-each loop
    //processes each item, without changing the collection or array.
    for (Number number : numbers){
      log(number);
    }

    //use with an array
    String[] names = {"Ethan Hawke", "Julie Delpy"};
    for(String name : names){
      log("Name : " + name);
    }

    //removal of items requires an explicit iterator,
    //so you can't use a for-each loop in this case
    List<String> words = new ArrayList<>();
    words.add("Il ne lui faut que deux choses: ");
    words.add("le");
    words.add("pain");
    words.add("et");
    words.add("le");
    words.add("temps.");
    words.add("- Alfred de Vigny.");
    Iterator<String> iter = words.iterator();
    
    while( iter.hasNext() ){
      if (iter.next().length() == 4){
        iter.remove();
      }
    }
    log("Edited words: " + words.toString());

    //if used with a non-parameterized type (not recommended), 
    //then Object must be used, along with a cast
    Collection stuff = new ArrayList();
    stuff.add("blah");
    for (Object thing : stuff){
      String item = (String)thing;
      log("Thing : " + item);
    }
  }

  // PRIVATE
  private static void log(Object aThing){
    System.out.println(aThing);
  }
}