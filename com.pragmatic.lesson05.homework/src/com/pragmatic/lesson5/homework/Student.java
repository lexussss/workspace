package com.pragmatic.lesson5.homework;

public class Student extends Person {
	private double score;

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if (score > 2 && score <= 6) {
			this.score = score;
		} else {
			System.out.println("Error!");
		}
	}

	Student(String name, int age, boolean isMan, double score) {
		super(name, age, isMan);
		this.score = score;
	}

	public void showStudentInfo() {
		System.out.println("Score of " + this.getName() + " are " + this.getScore()
				+ " and he/she is " + this.getAge() + " years old.");

	}

}
