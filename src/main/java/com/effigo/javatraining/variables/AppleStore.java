package com.effigo.javatraining.variables;

public class AppleStore {
	
	public static void main(String[] args) {
		int numofApples = 0;
		int numofCustomers = 0;
		double profit = 0;
		
		System.out.println("Yo picked 500 apples from an apple orchad");
		numofApples += 500;
		
		System.out.println("Time for business! You're selling each apple for 40 cents");
		double price = 0.40;
		
		System.out.println("One customer walked in. He bought 4 apples!");
		numofCustomers += 1;
		profit += 4 * price;
		numofApples -= 4;
		
		System.out.println("Another customer walked in. He bought 20 apples!");
		numofCustomers += 1;
		profit += 20 * price;
		numofApples -= 20;
		
		System.out.println("Another customer walked in. He bought 200 apples!");
		numofCustomers += 1;
		profit += 200 * price;
		numofApples -= 200;
		

        System.out.println("Wow! So far, you made: "+ profit);
        System.out.println(numofCustomers + "customers love your apples.");
        System.out.println("You have "+ numofApples +" apples left.");

				
		
		
		
	}

}
