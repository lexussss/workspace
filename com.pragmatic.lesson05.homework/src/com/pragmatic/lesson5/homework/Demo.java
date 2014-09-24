package com.pragmatic.lesson5.homework;

public class Demo {

	public static void main(String[] args) {
		// Task1
		Person[] PersonArray = new Person[10];

		// Task2
		Person Person1 = new Person("Person1", 17, true);
		PersonArray[0] = Person1;
		Person Person2 = new Person("Person2", 19, false);
		PersonArray[1] = Person2;
		Person Student1 = new Student("Student1", 17, true, 4);
		PersonArray[2] = Student1;
		Person Student2 = new Student("Student2", 22, true, 6);
		PersonArray[3] = Student2;
		Person Employee1 = new Employee("Employee1", 20, true, 100);
		PersonArray[4] = Employee1;
		Person Employee2 = new Employee("Employee2", 40, false, 200);
		PersonArray[5] = Employee2;

		// Task3
		for (int i = 0; i < 10; i++) {
			if (PersonArray[i] instanceof Employee) {
				((Employee) PersonArray[i]).showEmployeeInfo();

			} else {
				if (PersonArray[i] instanceof Student) {
					((Student) PersonArray[i]).showStudentInfo();
				} else {
					if (PersonArray[i] instanceof Person) {
						PersonArray[i].showPersonInfo();
					} else {
						System.out.println("Error");
					}
				}
			}
		}

		// Task4
		for (int i = 0; i < 10; i++) {
			if (PersonArray[i] instanceof Employee) {
				System.out.println("Overtime value: " + ((Employee) PersonArray[i])
						.calculateOvertime(2));

			}
		}

	}
}
