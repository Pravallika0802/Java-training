package com.effigo.javatraining.booleanandconditional;

public class AskJava {
	public static void main(String[] args){
		double change = 3.50;
		double price = 2.50;
		System.out.println("Hi Java! Do I have any chips to buy?");
		System.out.println("Java: " + (change >= price) + "\n");
		int capacity = 13;
		int people = 14;
		System.out.println("Hi Java, can elevator hold everyone?");
		System.out.println("Java: " + (capacity <= people) + "\n");
		String request = "ps5";
		String purchase = "toycar";
		System.out.println("Hi Java, will my friend be happy?");
		System.out.println("Java: " + (request == purchase) + "\n");
		int space = 10;
		int guests = 8;
		System.out.println("Hi Java, can everyone attnd my dinner party");
		System.out.println("Java: " + (space <= guests) + "\n");
		int yourvotes = 50;
		int competitorvotes = 55;
		System.out.println("Hi Java, will I win the elections?");
		System.out.println("Java: " +(yourvotes > competitorvotes) + "\n");
		
		
		
		
	}

}
