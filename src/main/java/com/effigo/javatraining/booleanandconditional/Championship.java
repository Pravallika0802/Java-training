package com.effigo.javatraining.booleanandconditional;

public class Championship {
	public static void main(String[] args) {
		int gryffindor = 400;
		int ravenclaw = 200;
		int margin = gryffindor - ravenclaw;
		if (gryffindor >= 300) {
			System.out.println("Gryffindor takes the house cup!");
		} else if (margin >= 0) {
			System.out.println("In second place, Gryffindor!");
		} else if (margin >= -100) {
			System.out.println("In third place, Gryffindor!");
		} else {
			System.out.println("In fourth place, Gryffindor!");
			
		}

	}

}
