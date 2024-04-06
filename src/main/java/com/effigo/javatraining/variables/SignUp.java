package com.effigo.javatraining.variables;

import java.util.Scanner;

public class SignUp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Javagram! Let's sign you up.");
		System.out.println("What is your first name?");
		String fName = scan.nextLine();
		System.out.println("What is your last name?");
		String lName = scan.nextLine();
		System.out.println("How old are you?");
		int age = scan.nextInt();
		System.out.println("Make a user name");
		scan.nextLine();
        String userName = scan.nextLine();
        System.out.println("What city do you live in?");
        String city = scan.nextLine();
        System.out.println("What country is that?");
        String country = scan.nextLine();
        
        System.out.println("Thank you for joining Javagram!");
        System.out.println("\n Here is the information you entered:");
        System.out.println("\t First name: " + fName);
        System.out.println("\t Last name: " + lName);
        System.out.println("\t age: " + age);
        System.out.println("\t Username: " + userName );
        System.out.println("\t city: " + city);
        System.out.println("\t country: " + country);
		
        scan.close();		
	}

}
