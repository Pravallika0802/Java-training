package com.effigo.javatraining.function;

public class Weather {
	public static void main(String[] args) {
		double noon = 77;
		double evening = 65;
		double midnight = 51;
		printTemperatures(noon);
		printTemperatures(evening);
		printTemperatures(midnight);
		
	}
	public static double fahrenheitToCelcius(double F) {
		double C = (F - 32) * 5/9;
		return C;
	}
	
	public static void printTemperatures(double F) {
		System.out.println("Temperature in Fahrenheit " + F);
		System.out.println("Temperature in Celcius " + fahrenheitToCelcius(F));
	}
	}

