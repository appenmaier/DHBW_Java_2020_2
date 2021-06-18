package testexam;

import java.util.ArrayList;

public class Model {

	private static Model instance;
	private ArrayList<Movie> movies;

	private Model() {
		movies = new ArrayList<>();
	}

	public static Model getInstance() {
		if (instance == null) {
			instance = new Model();
		}
		return instance;
	}

	public void addMovie(String description, String genreDescription, String publishingYear) throws Exception {
		Genre genre = null;
		for (Genre g : Genre.values()) {
			if (g.getDescription().equals(genreDescription)) {
				genre = g;
			}
		}

		/*
		 * Erweiterung
		 */
		if (genre == null) {
			throw new Exception("invalid genre description");
		}

		try {
			Movie movie = new Movie(description, genre, Short.valueOf(publishingYear));
			movies.add(movie);
		} catch (NumberFormatException e) {
			throw new Exception("invalid publishing year");
		}
		/*
		 * Erweiterung
		 */
	}

}
