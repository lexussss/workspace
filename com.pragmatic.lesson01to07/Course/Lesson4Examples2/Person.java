package Lesson4Examples2;

public class Person {

	String name;
	int age;
	long personalID;
	boolean isMale;
	double weight;
	String address;
	Person[] friends;
	double money;
	Car car;
	
	Person() {
		this.age = 0;
		this.weight = 4.0;
	}
	
	Person(String name, long personalNumber, boolean isMale) {
		this();
		this.name = name;
		this.personalID = personalNumber;
		this.isMale = isMale;
		friends = new Person[3];
	}
	
	void eat() {
		System.out.println(name + " is eating...");
	}
	
	void walk() {
		System.out.println("Walking...");
	}
	
	void growUp() {
		System.out.println("Growing with one year");
		age++;
	}
	
	void drinkWater(double liter) {
		if(liter > 1) {
			System.out.println("Too much water for drinking...");
		} else {
			System.out.println("Drinking " + liter + "l water");
		}
	}
	
	void buyCar(Car car) {
		if(this.money > car.price) {
			this.car = car;
			this.money = this.money - car.price;
		} else {
			System.out.println("Sorry you don't have enough money to buy that car");
		}
		
		car.changeOwner(this);	
	}
}
