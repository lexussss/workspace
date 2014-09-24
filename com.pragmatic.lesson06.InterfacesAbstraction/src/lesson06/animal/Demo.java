package lesson06.animal;

public class Demo {
	public static void main(String[] args) {

		IZoo zoo = new Zoo(10);
		Cat cat = new Cat();
		Dog dog = new Dog();
		Animal bird = new Bird();

		((Bird)bird).sing();
		
		zoo.addAnimal(cat);
		zoo.addAnimal(dog);
		zoo.addAnimal(bird);
		
		int[] intArray = new int[] {5, 6, 7};
		
		Object[] animalsInTheZoo = (Object[])zoo.getAnimals().toArray();
		
	
		
		for (int i = 0; i < animalsInTheZoo.length; i++) {
			if(animalsInTheZoo[i] != null) {
				((Animal)animalsInTheZoo[i]).walk();
				((Animal)animalsInTheZoo[i]).makeSomeNoise();
			}
		}	

	}
}
