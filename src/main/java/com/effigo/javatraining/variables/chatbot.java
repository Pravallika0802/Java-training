package com.effigo.javatraining.variables;

import java.util.Scanner;

public class chatbot {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello. What is your name?");
		String name = scan.nextLine();
		System.out.println("Hi" + name + "! I'm Javabot where are you from?");
		String home = scan.nextLine();
		System.out.println("I here its beautiful place at " + home + "! I'm from a place called oracle");
		System.out.println("How old are you?");
		int age = scan.nextInt();
		System.out.println("So you are " + age + ", Cool! Iam 400 years old");
		System.out.println("This mean Iam " + (400 / age) + " times older than you. ");
		System.out.println("Enough about me. What's your favourite language? (Don't just say its python)");
		scan.nextLine();
		String language = scan.nextLine();
		System.out.println("\n" + language + ", that's great!Nice chatting with you " + name + " I have to log of now. See Ya!");
		scan.close();
		
		
		
	}

}
