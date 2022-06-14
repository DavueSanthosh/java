package Encapsulation;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		
		System.out.println("Enter the student Details:" );

		Scanner values = new Scanner(System.in);
		
		Student details = new Student();
		
		details.setName(values.nextLine());
		details.setAdmissionID(values.nextInt());
		details.setPhoneNumber(values.nextLong());
		details.setEmailID(values.next());

		
		System.out.println("Student name:"+" "+ details.getName());
		System.out.println("Student AdmissionID:"+" "+details.getAdmissionID());
		System.out.println("Student Phone no:"+" "+details.getPhoneNumber());
		System.out.println("Student EmailID:"+" "+ details.getEmailID());
		}

		
	}


