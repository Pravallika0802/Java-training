package com.effigo.javatraining.Arrays;

import java.util.Scanner;

public class Grocer {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		String[] store = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
		System.out.println("\n Welcome to Java Grocer");
		System.out.println("What can I help you to find?");
		String reply = scan.nextLine();
		for (int i = 0; i < store.length; i++) {
			if (store[i].equals(reply)) {
				System.out.println("We have that in aisle:" + i);
				break;
			} 
		}
		
		scan.close();
		
	}

}
