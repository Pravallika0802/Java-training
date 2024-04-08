package com.effigo.javatraining.booleanandconditional;

public class WeatherNetwork {
	public static void main(String[] args) {
		int temp = 25;
		String forecast;
		if (temp >= 25) {
			forecast = " It's warm. Go outside! ";
		} else if (temp <= 10) {
			forecast = " The forecast is Chilly. Wear a coat! ";
		} else {
			forecast = " The forecast is FREEZING! Stay home! ";
			
		}
		System.out.println(forecast);
	}

}
