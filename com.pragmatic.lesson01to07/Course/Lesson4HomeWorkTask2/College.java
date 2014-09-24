package Lesson4HomeWorkTask2;

import java.util.Arrays;

public class College {

	public static void main(String[] args) {
		StudentGroup math = new StudentGroup("Math");
		Student petko = new Student("Petko", "Math", 19);
		System.out.println(petko.subject);
		Student ivan = new Student("Ivan", "Math", 20);
		System.out.println(ivan.subject);

		math.addStudent(petko);
		System.out.println(petko.subject);
		math.addStudent(ivan);
		System.out.println(ivan.subject);
		
		petko.receiveScholarship(4, 20);
		ivan.upYear();

		math.theBestStudent();
	}

}
