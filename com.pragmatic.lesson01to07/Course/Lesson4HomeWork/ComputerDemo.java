package Lesson4HomeWork;

public class ComputerDemo {

	public static void main(String[] args) {

		Computer alpha = new Computer();
		Computer beta = new Computer();
		Computer gamma = new Computer(2011, 1000, 200000, 1000);
		Computer delta = new Computer(2011, 1100, false, 100000, 500, "Linux");

		alpha.freeMemory = 4000;
		alpha.hardDiskMemory = 100000;
		alpha.isNotebook = false;
		alpha.operationSystem = "Windows 8";
		alpha.price = 2000;
		alpha.year = 2014;

		beta.freeMemory = 2000;
		beta.hardDiskMemory = 50000;
		beta.isNotebook = true;
		beta.operationSystem = "Mac";
		beta.price = 2000;
		beta.year = 2013;

		alpha.changeOperationSystem("Linux");
		beta.useMemory(500);

		int a = alpha.comparePrice(beta);

		System.out.println(a);
		
		switch (a) {
		case 0:
			System.out.println("The cost of computer alpha and beta is the same.");
			break;
		case 1:
			System.out.println("The price of computer alpha is higer");
			break;
		case -1:
			System.out.println("The price of computer beta is higer");
			break;
		default:
			System.out.println("Error");
			break;
		}

		 System.out.println("Computer alpha is with following parameters: ");
		 System.out.println("Free memory: " + alpha.freeMemory + " MB");
		 System.out.println("Free hard disk memory: " + alpha.hardDiskMemory
		 + " MB");
		 System.out.println("IsNotebook: " + alpha.isNotebook);
		 System.out.println("OS: " + alpha.operationSystem);
		 System.out.println("Price: " + alpha.price + " $");
		 System.out.println("Year: " + alpha.year + " year");
		 System.out.println();
		
		 System.out.println("Computer beta is with following parameters: ");
		 System.out.println("Free memory: " + beta.freeMemory + " MB");
		 System.out.println("Free hard disk memory: " + beta.hardDiskMemory
		 + " MB");
		 System.out.println("IsNotebook: " + beta.isNotebook);
		 System.out.println("OS: " + beta.operationSystem);
		 System.out.println("Price: " + beta.price + " $");
		 System.out.println("Year: " + beta.year + " year");

	}

}