package inheritance;

import java.util.ArrayList;

public class TvShow extends Media {

	int seasons;
	int episodes;

	public TvShow(String title, String rating, Director director, ArrayList<Actor> cast, int seasons, int episodes) {
		super(title, rating, director, cast);
		this.seasons = seasons;
		this.episodes = episodes;
	}

	public int getSeasons() {
		return seasons;
	}

	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}

	public int getEpisodes() {
		return episodes;
	}

	public void setEpisodes(int episodes) {
		this.episodes = episodes;
	}

	@Override
	public String toString() {
		return "TvShow [seasons=" + seasons + ", episodes=" + episodes + "]";
	}

	public static void main(String[] args) {

		ArrayList<Actor> cast = new ArrayList<>();
		Actor actor1 = new Actor("Kirthika", "amarnath", 1987);
		cast.add(actor1);
		Actor actor2 = new Actor("Ashok", "NarayanaMoorthy", 1983);
		cast.add(actor2);
		ArrayList<String> moviesDone = new ArrayList<>();
		moviesDone.add("xxx");

		Director director = new Director("Harish", "Kovoor", new ArrayList<>(moviesDone));

		TvShow tvShow = new TvShow("Kungfupanda", "y", director, cast, 3, 10);
		System.out.println(tvShow);
		System.out.println(tvShow.getEpisodes() + "episodes");
		System.out.println(actor1);
	}

}
