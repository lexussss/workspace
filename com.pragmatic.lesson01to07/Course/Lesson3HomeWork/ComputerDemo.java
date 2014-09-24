package Lesson3HomeWork;

public class ComputerDemo {

	public static void main(String[] args) {

		Computer alpha = new Computer();
		Computer beta = new Computer();
		
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
		beta.price = 2500;
		beta.year = 2013;
		
		alpha.changeOperationSystem("Linux");
		beta.useMemory(500);
		
		System.out.println("Computer alpha is with following parameters: ");
		System.out.println("Free memory: " + alpha.freeMemory + " MB");
		System.out.println("Free hard disk memory: " + alpha.hardDiskMemory + " MB"); 
		System.out.println("IsNotebook: " + alpha.isNotebook);
		System.out.println("OS: " + alpha.operationSystem);
		System.out.println("Price: " + alpha.price + " $");
		System.out.println("Year: " + alpha.year + " year");
		System.out.println();

		System.out.println("Computer beta is with following parameters: ");
		System.out.println("Free memory: " + beta.freeMemory + " MB");
		System.out.println("Free hard disk memory: " + beta.hardDiskMemory + " MB"); 
		System.out.println("IsNotebook: " + beta.isNotebook);
		System.out.println("OS: " + beta.operationSystem);
		System.out.println("Price: " + beta.price + " $");
		System.out.println("Year: " + beta.year + " year");
		
	}
	
}
