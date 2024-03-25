package inheritance;

import java.util.ArrayList;

public class Media {
	String title;
	String rating;
	Director director;
	ArrayList<Actor> cast;

	public Media(String title, String rating, Director director, ArrayList<Actor> cast) {
		this.title = title;
		this.rating = rating;
		this.director = director;
		this.cast = cast;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public ArrayList<Actor> getCast() {
		return cast;
	}

	public void setCast(ArrayList<Actor> cast) {
		this.cast = cast;
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

		Media media = new Media("Kungfupanda", "R", director, cast);

		System.out.println(media.getRating());
		media.setDirector(director);
		System.out.println(media.getTitle());
		System.out.println(media.getCast());
		System.out.println(media.getDirector());
	}

}
