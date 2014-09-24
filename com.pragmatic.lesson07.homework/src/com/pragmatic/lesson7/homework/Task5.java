package com.pragmatic.lesson7.homework;

public class Task5 {
	public static void main(String[] args) {

		double[] arrayTask5 = new double[10];
		for (int i = 0; i < arrayTask5.length; i++) {
			arrayTask5[i] = i * 3;
		}
		for (int i = 0; i < (arrayTask5.length); i++) {
			System.out.print(arrayTask5[i] + ", ");
		}
	}
}
