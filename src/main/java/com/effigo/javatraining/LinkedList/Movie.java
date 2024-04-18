package com.effigo.javatraining.LinkedList;

public class Movie {

	private String name;
	private String storage;
	private double rating;
	
	public Movie(Movie movie) {
		this.name = movie.name;
		this.storage = movie.storage;
		this.rating = movie.rating;
	}
 	public Movie(String name, String storage, double rating) {
		super();
		this.name = name;
		this.storage = storage;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", storage=" + storage + ", rating=" + rating + "]";
	}
 	
 	
	
}
