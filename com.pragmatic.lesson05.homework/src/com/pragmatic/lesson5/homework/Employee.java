package com.pragmatic.lesson5.homework;

public class Employee extends Person {
	private double daySaylary;

	public Employee(String name, int age, boolean isMan, double daySalary) {
		super(name, age, isMan);
		this.daySaylary = daySalary;
	}

	double calculateOvertime(double hours) {
		double overtimeValue = 0;
		if (this.getAge() < 18) {
		} else {
			overtimeValue = ((hours * (daySaylary / 8)) * 1.5);
			daySaylary = daySaylary+overtimeValue;
		}
		return overtimeValue;
	}

	public void showEmployeeInfo() {
		System.out.println(this.getName() + " is " + this.getAge()
				+ " years old. Salary for today: " + daySaylary);

	}

}
