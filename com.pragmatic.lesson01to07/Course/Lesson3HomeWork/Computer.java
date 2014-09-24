package Lesson3HomeWork;

public class Computer {
	short year;
	float price;
	boolean isNotebook;
	int hardDiskMemory;
	double freeMemory;
	String operationSystem;
	
	void changeOperationSystem(String newOperationSystem){
		operationSystem = newOperationSystem;
	}
	
	void useMemory(double memory){
		if (freeMemory < memory) {
			System.out.println("Not enough free memory!");
		}
		else
			freeMemory = freeMemory - memory;
	}
	
}
