package SchoolManagement;

import java.util.Scanner;

public class Student {
	
	private String studentId;
	private int semester;
	private String firstName;
	private String lastName;
	private String courses = null;
	private static int generalId = 1000;
	private static int coursePreis = 500;
	private int tuitionBalance = 0;
	
	public Student( ) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("First Name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Last Name: ");
		this.lastName = in.nextLine();
		
		System.out.println("Which Semester (1-6): ");
		this.semester = in.nextInt();
		
		SetStudentId();
		
		System.out.println(firstName + " " + lastName + " " + semester + " " + studentId);
		
	
	}
	
	private void SetStudentId() {
		
		generalId++;
		this.studentId = generalId + "" + semester;
			
	}
	
	public void enroll() {
		Scanner in2 = new Scanner(System.in);
		System.out.println("How many courses do you want to enroll on: ");
		int courseLimit = in2.nextInt();
		for (int i = 0; i<=courseLimit;i++) {
			Scanner in = new Scanner(System.in);
			System.out.println("Which coruse do you want to enroll on? (Type Q to qiut): ");
			String inputCourse = in.nextLine();
			if (!inputCourse.equals("Q")) {
				courses	 = courses + "\n" + inputCourse;
				tuitionBalance = tuitionBalance + coursePreis;
				System.out.println("Enrolled in: " + courses);
				System.out.println("Tuition balance at the moment: " + tuitionBalance);
				}
			else {
				System.out.println("Quitted.");
				System.out.println("Enrolled in: " + courses);
				System.out.println("Tuition balance at the end: " + tuitionBalance);
				break ;
			}
		   }
		
	}
	

}
