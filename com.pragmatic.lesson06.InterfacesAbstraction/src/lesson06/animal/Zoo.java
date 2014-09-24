package lesson06.animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements IZoo {
	private List animals;
	
	public Zoo(int cages) {
		animals = new ArrayList();
	}
	
	public void addAnimal(Animal animalToAdd) {
//		for (int i = 0; i < animals.length; i++) {
//			if(animals[i] == null) {
//				animals[i] = animalToAdd;
//				return;
//			}
//		}
		this.animals.add(animalToAdd);
	
	}
	
	public void freeAllAnimals(){
		this.animals = new ArrayList<>();
	}
	
	public void walkAnimal(Animal animal) {
		animal.walk();
		//if animal is bird, sing...
		if(animal instanceof Bird) {
			((Bird)animal).sing();
		}
	}
	
	public void walkAnimals() {
//		for (int i = 0; i < animals.length; i++) {
//			Animal animal = animals[i];
//			if(animal == null) {
//				continue;
//			}
//			animal.walk();
//			animal.makeSomeNoise();
//		}
//		
		for (Object animal : this.animals) {
			Animal an = (Animal)animal;
			an.walk();
			an.makeSomeNoise();
		}
	}

	public List getAnimals() {
		return this.animals;
	}
}
