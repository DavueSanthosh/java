package Encapsulation;

import java.util.Scanner;

public class Register {
	
public static void main(String[] args) {
		
		System.out.println("Enter the student Details:" );

		Scanner values = new Scanner(System.in);
		
		String next = values.next();
		
		College details = new College();
		
		
		details.setName("Virat");
		details.setAdmissionID(2013);
		details.setPhoneNumber(22768);
		details.setEmailID("davuesanthosh12@gmail.com");

//		
//		System.out.println("Student name:"+" "+ details.getName());
//		System.out.println("Student AdmissionID:"+" "+details.getAdmissionID());
//		System.out.println("Student Phone no:"+" "+details.getPhoneNumber());
//		System.out.println("Student EmailID:"+" "+ details.getEmailID());
	}

		
	}


