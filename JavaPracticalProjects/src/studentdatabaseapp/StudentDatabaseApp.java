package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		//Ask how many new users we want to add
		System.out.print("Enter number of students to enroll: ");
		Scanner input = new Scanner(System.in);
		int numOfStudents = input.nextInt();
		Student[] students = new Student[numOfStudents];
		
		//Create n number of new students
		for(int n =0; n<numOfStudents; n++) {
				//Student stu1 = new Student();
			students[n] = new Student();
			students[n].entorll();
			students[n].payTuition();	
			System.out.println(students[n].showInfo());
		}	
		
		/*System.out.println(students[0].showInfo());
		System.out.println(students[1].showInfo());
		System.out.println(students[2].showInfo());*/
		
	}

}
