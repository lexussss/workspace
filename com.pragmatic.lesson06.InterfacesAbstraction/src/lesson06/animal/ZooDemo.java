package lesson06.animal;

import java.util.List;

public class ZooDemo {
	public static void main(String[] args) {
		Zoo sofiaZoo = new Zoo(5);
		
		//!!!
		Animal sharo = new Dog();
		Animal tomas = new Cat();
		
		sofiaZoo.addAnimal(sharo);
		sofiaZoo.addAnimal(tomas);
		

//		sharo.walk();
//		pissi.walk();
		sofiaZoo.walkAnimals();
		
		Animal animal = new Bird();
		//compilation error
		//bird.sing();

//		List animalList = (List) animal;
		
		System.out.println( animal instanceof List  ? "animal is a list" : " animal is NOT a list");
		
		if(animal instanceof Bird) {
			((Bird)animal).sing();
		}
		
		
		
	}
}
