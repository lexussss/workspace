package Lesson3HomeWorkCodeSolutions;

public class ComputerDemo {
	public static void main(String[] args) {
		Computer hp = new Computer();
		Computer lenovo = new Computer();
		
		hp.year = 2000;
		hp.hardDiscMemory = 200;
		hp.freeMemory = hp.hardDiscMemory;
		hp.isNotebook = false;
		hp.operationSystem = "Linux";
		hp.price = 1000;
		
		lenovo.year = 2010;
		lenovo.hardDiscMemory = 300;
		lenovo.freeMemory = hp.hardDiscMemory;
		lenovo.isNotebook = true;
		lenovo.operationSystem = "Windows";
		lenovo.price = 2000;
		
		lenovo.changeOperationSystem("Linux");
		lenovo.useMemory(300);
		hp.useMemory(100);		
	}
}
