package studentdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000; // static is a class varible not an object. This will count every student that
									// we create.

	// constructor: prompt user to enter student's name and year
	public Student() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = input.nextLine();

		System.out.println("Enter student last name: ");
		this.lastName = input.nextLine();

		System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = input.nextInt();
		setStudentID();
		//System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
	}

	// generate an ID
	private void setStudentID() {
		// Grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	// enrol in courses
	public void entorll() {
		// get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner input = new Scanner(System.in);
			String course = input.nextLine();
			if (!course.equalsIgnoreCase("Q")) { // ignores the case that you type in
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				System.out.println("Break");
				break;
			}
		} while (1 != 0);
	}	
	// view balance
	public void viewBalance() {
		System.out.print("Your balanace is: $" + tuitionBalance);
	}
	// pay tuition
	public void payTuition() {
		System.out.print("Enter Your Payment: $");
		Scanner input = new Scanner(System.in);
		int payment = input.nextInt();
		tuitionBalance= tuitionBalance-payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	// show status
	public String showInfo() {
		return "Name: " + firstName + "" + lastName +
				"\n Grade LEvel: " + gradeYear +
				"\nCourses Enroled:" + courses +
				"\nBalance: $" + tuitionBalance;
	}
}
