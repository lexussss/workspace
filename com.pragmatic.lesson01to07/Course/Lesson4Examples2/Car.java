package Lesson4Examples2;

public class Car {
	String model;
	double maxSpeed;
	double currentSpeed;
	String color;
	int gear;
	Person owner;
	double price;
	boolean isSportCar;
	boolean demolished;
	
	Car(String model, boolean isSportCar, String color){
		this.model = model;
		this.isSportCar = isSportCar;
		this.color = color;
	}
	
	Car(String model, boolean isSportCar, String color, double price, double maxSpeed) {
		this(model, isSportCar, color);
		this.price = price;
		if (!isSportCar && maxSpeed > 200) {
			this.maxSpeed = 200;
		} else {
			this.maxSpeed = maxSpeed;
		}
	}

	void accelerate() {
		currentSpeed = currentSpeed + 10;
		System.out.println(currentSpeed);
	}
	
	void changeGearUp() {
		if(gear == 5) {
			System.out.println("Tha max gear is 5.");
		} else {
			gear++;
			System.out.println("Current gear is " + gear);
		}
	}
	
	void changeGear(int nextGear) {
		if(nextGear < 1 || nextGear > 5) {
			System.out.println("Sorry, choose gear between 1 and 5");
		} else {
			gear = nextGear;
		}
	}
	
	void changeColor(String newColor) {
		color = newColor;
		System.out.println("The new color is " + newColor);
	}
	
	boolean isMoreExpensive(Car car) {
		if(this.price > car.price){
			return true;
		} else {
			return false;
		}
	}
	
	double calculateCarPriceForScrap(double metalPrice) {
		double coef = 0.2;
		if(isSportCar) {
			coef += 0.05;
		} 
		
		if(color.equalsIgnoreCase("Black") || color.equalsIgnoreCase("white")) {
			coef += 0.05;
		}
		
		return metalPrice * coef;
		
	}
	
	void changeOwner(Person newOwner) {
		this.owner = newOwner;
		newOwner.car = this;
		System.out.println("The new owner of the car is " + this.owner.name );
	}
	
	void sellCarForScrap(double metalPrice) {
		System.out.println("Current money of the car owner are: " + this.owner.money);
		if(this.demolished == false) {
			this.demolished = true;
		} else {
			System.out.println("This car has already been sold for scrap!");
			return;
		}
		
		this.owner.money += calculateCarPriceForScrap(metalPrice);
		System.out.println("Current money of the car owner are: " + this.owner.money);

	}
}
