//: c09:Cat.java
package lesson07;

public class Cat {
	
  private int catNumber;
  Cat(int i) {
	  catNumber = i;
  }
  
  void print() {
    System.out.println("Cat #" + catNumber);
  }
} 