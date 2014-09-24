package Lesson4HomeWorkTask2;

import Lesson4HomeWorkCodeSolutions.Student;

public class StudentGroup {
	String groupSubject;
	Student[] students;
	byte freeSpaces;

	public StudentGroup() {
		students = new Student[5];
		freeSpaces = 5;
	}

	public StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}

//	void addStudent(Student s) {
//		for (int i = 0; i < 5; i++) {
//			if (students[i].subject.equalsIgnoreCase(this.groupSubject)
//					&& this.freeSpaces < 5 && students[i] != null) {
//				students[i] = s;
//			} else {
//				System.out.println("Error");
//			}
//		}
//
//	}
	
	void addStudent(Student s) {
		if(!s.subject.equals(this.groupSubject)) {
			System.out.println(s.name +" has different subject!");
			return;
		}
		if(freeSpaces == 0) {
			System.out.println("Sorry, there is not free place");
			return;
		}
		
		students[students.length - freeSpaces] = s;
		freeSpaces --;
	}

	void emptyGroup() {
		students = new Student[5];
		freeSpaces = 5;
	}

	Student theBestStudent() {
		Student bestStudentScore = students[0];
		for (int i = 0; i < 5; i++) {
			if (students[i].grade > bestStudentScore.grade) {
				bestStudentScore = students[i];
			}

		}
		return bestStudentScore;

	}
	
	
	
	
	
	
	
	String findBestStudent() {
		// be careful of the group have students
		Student bestStudent = students[0];
		
		for (int i = 1; i < students.length - freePlaces; i++) {
			if(students[i].grade > bestStudent.grade) {
				bestStudent = students[i];
			}
		}
		return bestStudent.name;
	}
	
	
	
	
	
	
	
	
	
	
	
}
