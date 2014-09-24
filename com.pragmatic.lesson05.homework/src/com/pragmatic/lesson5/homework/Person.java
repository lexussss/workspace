package com.pragmatic.lesson5.homework;

public class Person {
	private String name;
	private int age;
	private boolean isMan;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0 && age < 100) {
			this.age = age;
		} else {
			System.out.println("Error!");
		}

	}

	public Person(String name, int age, boolean isMan) {
		this.name = name;
		this.age = age;
		this.isMan = isMan;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMan() {
		return isMan;
	}

	public void setMan(boolean isMan) {
		this.isMan = isMan;
	}

	void showPersonInfo() {
		System.out.println(this.name + " is " + this.age
				+ " years old and is man:" + isMan);
	}

}
