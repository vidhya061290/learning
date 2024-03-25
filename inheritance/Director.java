package inheritance;

import java.util.ArrayList;

public class Director {
	String firstname;
	String lastname;
	ArrayList<String> moviesDone;

	public Director(String firstname, String lastname, ArrayList<String> moviesDone) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.moviesDone = moviesDone;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public ArrayList<String> getMoviesDone() {
		return moviesDone;
	}

	public void setMoviesDone(ArrayList<String> moviesDone) {
		this.moviesDone = moviesDone;
	}

	@Override
	public String toString() {
		return "Director [firstname=" + firstname + ", lastname=" + lastname + ", moviesDone=" + moviesDone + "]";
	}

	public static void main(String[] args) {
		ArrayList<String> moviesDone = new ArrayList<>();
		moviesDone.add("xxx");
		moviesDone.add("yyy");
		Director director = new Director("Harish", "Kovoor", moviesDone);
		director.setMoviesDone(moviesDone);
		System.out.println(director.getMoviesDone());
		System.out.println(director);
	}
}
