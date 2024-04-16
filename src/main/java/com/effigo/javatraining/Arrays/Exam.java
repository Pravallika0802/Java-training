package com.effigo.javatraining.Arrays;

public class Exam {
	public static void main(String[] args) {
		System.out.println("Its time to take your 5th year exams. Please take your seats");
		String[] seats = {"Harry", "Neville", "Ron", "Hermione", "Seamus"};
		for (int i = 0; i< seats.length-1; i++){
			System.out.println(seats[i] + ", you will take seat " + i);
		}
				
	}
	
}
