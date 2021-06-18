package testexam;

public final class BluRay extends VideoStorageMedia implements OpticalStorageMedia {

	private int capacity;

	public BluRay(Movie movie, int capacity) {
		super(movie);
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public String toString() {
		Movie movie = getMovie();

		String movieDescription = movie.getDescription();
		Genre movieGenre = movie.getGenre();
		short moviePublishingYear = movie.getPublishingYear();

		String movieGenreDescription = movieGenre.getDescription();

		return movieDescription + ", " + movieGenreDescription + ", " + moviePublishingYear + ", " + capacity + "GB";
//		return getMovie().getDescription() + ", " + getMovie().getGenre().getDescription() + ", "
//				+ getMovie().getPublishingYear() + ", " + capacity + "GB";
	}

}
