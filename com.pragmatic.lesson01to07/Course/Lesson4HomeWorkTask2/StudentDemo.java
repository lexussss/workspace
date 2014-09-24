package Lesson4HomeWorkTask2;

public class StudentDemo {

	public static void StudentDemo() {
		Student Ivan = new Student();
		Ivan.grade = 3;
		
		System.out.println("Ivan's year in college is: " + Ivan.yearInCollege);
		System.out.println("Is Ivan already graduated: " + Ivan.isDegree);

		Ivan.upYear();
		System.out.println("Ivan's year in college is: " + Ivan.yearInCollege);
		System.out.println("Is Ivan already graduated: " + Ivan.isDegree);

		Ivan.upYear();
		System.out.println("Ivan's year in college is: " + Ivan.yearInCollege);
		System.out.println("Is Ivan already graduated: " + Ivan.isDegree);

		Ivan.upYear();
		System.out.println("Ivan's year in college is: " + Ivan.yearInCollege);
		System.out.println("Is Ivan already graduated: " + Ivan.isDegree);

		Ivan.upYear();
		System.out.println("Ivan's year in college is: " + Ivan.yearInCollege);
		System.out.println("Is Ivan already graduated: " + Ivan.isDegree);

		System.out.println(Ivan.receiveScholarship(4, 1000));
		
	}

}
