package inheritance;

import java.util.ArrayList;

public class Movie extends Media {
	int length;
	String description;
	double grossing;

	public Movie(String title, String rating, Director director, ArrayList<Actor> cast, int length, String description,
			double grossing) {
		super(title, rating, director, cast);
		this.length = length;
		this.description = description;
		this.grossing = grossing;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getGrossing() {
		return grossing;
	}

	public void setGrossing(double grossing) {
		this.grossing = grossing;
	}

	@Override
	public String toString() {
		return "Movie [length=" + length + ", description=" + description + ", grossing=" + grossing + "]";
	}

	public static void main(String[] args) {
		ArrayList<Actor> cast = new ArrayList<>();
		Actor actor1 = new Actor("vidhya", "amarnath", 1990);
		cast.add(actor1);
		Actor actor2 = new Actor("Akshara", "Kovoor", 2017);
		cast.add(actor2);
		ArrayList<String> moviesDone = new ArrayList<>();
		moviesDone.add("xxx");

		Director director = new Director("Harish", "Kovoor", new ArrayList<>(moviesDone));

		Movie movie = new Movie("Kungfupanda", "R", director, cast, 4, "comedy", 300.0);
		System.out.println(movie);
		System.out.println(movie.getDescription());
		System.out.println(movie.rating);
	}

}
