package Lesson1HomeWork;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter hour:");
		int hour = sc.nextInt();

		System.out.println("Enter money:");
		double money = sc.nextDouble();

		System.out.println("Enter am I helth:");
		boolean health = sc.nextBoolean();

		if (health==false){
			if (money > 0) {
				System.out.println("�?�?ма да излизам,ще отида да �?и куп�? лекар�?тва");
			}
			else {
					System.out.println("�?�?ма да излизам, ще пи�? чай");

				}
		}

			if (health==true){
				if (money > 0 && money < 10) {
					System.out.println("Ще отида на кафе");
				}
				else {
					System.out.println("Ще отида на ди�?котека");

					}

		}
			
		
		 
	}
}

