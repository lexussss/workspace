package Lesson4HomeWork;

public class Computer {
	short year;
	float price;
	boolean isNotebook;
	int hardDiskMemory;
	double freeMemory;
	String operationSystem;

	Computer() {
		isNotebook = false;
		operationSystem = "Win XP";
	}

	Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		year = this.year;
		price = this.price;
		hardDiskMemory = this.hardDiskMemory;
		freeMemory = this.freeMemory;
	}

	Computer(int year, double price, boolean isNotebook, double hardDiskMemory,
			double freeMemory, String operationSystem) {
		this(year, price, hardDiskMemory, freeMemory);
		isNotebook = this.isNotebook;
		operationSystem = this.operationSystem;
	}

	public int comparePrice(Computer comparisonsComputer) {
		int a = 0;
		if (this.price > comparisonsComputer.price) {
			a = 1;
		} else {
			if (this.price < comparisonsComputer.price) {
				a = -1;
			} else {
				a = 0;
			}
		}
	return a;
	}

	void changeOperationSystem(String newOperationSystem) {
		operationSystem = newOperationSystem;
	}

	void useMemory(double memory) {
		if (freeMemory < memory) {
			System.out.println("Not enough free memory!");
		} else
			freeMemory = freeMemory - memory;
	}

}
