package Lesson4Examples2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car bmw = new Car("bmw", true, "red", 450.23, 230);
		
		Person ivan = new Person("Ivan", 444444444444L, true);
		Person maria = new Person("Maria", 555555555555L, false);
		Person milen = new Person("Milen", 66666666666L, true);
		
		
		ivan.friends[1] = maria;
		ivan.friends[0] = milen;
		
		maria.friends[0] = ivan;
		
		maria.eat();
		bmw.changeColor("Black");
		
		Car mercedes = new Car("Mercedes S500", true, "White", 200000, 300);
		bmw.price = 100000;
		
		boolean comparison = bmw.isMoreExpensive(mercedes);
		System.out.println("Is " + bmw.model +" is more expensive than " + mercedes.model + ": " + comparison);
		
		System.out.println("The BMW price for scrap is: " + bmw.calculateCarPriceForScrap(20));
		bmw.changeColor("BlACK");
		System.out.println("The BMW price for scrap is: " + bmw.calculateCarPriceForScrap(20));
		bmw.changeOwner(maria);
		
		double bmwPriceForScrap = bmw.calculateCarPriceForScrap(20);
		bmw.sellCarForScrap(20);
		
		bmw.sellCarForScrap(40);
	}

}
