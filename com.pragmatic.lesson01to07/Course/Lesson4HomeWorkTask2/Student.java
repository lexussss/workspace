package Lesson4HomeWorkTask2;

public class Student {
	String name;
	String subject;
	double grade;
	byte yearInCollege;
	int age;
	boolean isDegree;
	double money;

	Student() {
		grade = 4.0;
		yearInCollege = 1;
		isDegree = false;
		money = 0;
	}

	Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}

	void upYear() {

		if (yearInCollege < 4) {
			yearInCollege++;
		} else {
			if (yearInCollege == 4) {
				System.out
						.println("You can't add anymore years. The student graduated.");
			}
		}
		if (yearInCollege == 4) {
			isDegree = true;
		}

	}

	double receiveScholarship(double min, double amount) {
		if (this.grade >= min && this.age < 30) {
			money = money + amount;
		} else {
			System.out
					.println("Student's grade is lower compared with te minimum or he is more than 30 years old.");
		}
		return money;

	}

}
