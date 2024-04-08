package com.effigo.javatraining.booleanandconditional;

public class JavaMart {
	public static void main(String[] args) {
		double wallet = 100.0;
		double toycar = 5.99;
		System.out.println("can I get this car?");
		if (toycar <= wallet){
			System.out.println("sure!");
			wallet -= toycar;
		} else {
			System.out.println("sorry! I have only " + wallet + "left");
		}
		double nike = 95.99;
		System.out.println("Can I get this nike shoes?");
		if (nike <= wallet){
			System.out.println("Sure!");
		} else {
			System.out.println("Sorry! I have  only " + wallet + " left ");
		}
	}

}
