package dataStructures;

public class Song implements Comparable<Song> {
	private final String title;
	private final String artist;
	private final String genre;
	private final int year;
	private int timesPlayed;
	
	private int bpm;
	
	public Song(String title, String artist, String genre, int year, int timesPlayed) {
		this.title = title.substring(0, 1).toUpperCase() + title.substring(1);
		this.artist = artist.substring(0, 1).toUpperCase() + artist.substring(1);
		this.genre = genre;
		this.year = year;
		this.timesPlayed = timesPlayed;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getTimesPlayed() {
		return timesPlayed;
	}
	
	public String toString() {
		return String.format("%s - %s - %s", title, artist, genre);
	}
	
	@Override
	public int compareTo(Song s) {
		return artist.compareTo(s.getArtist());
	}
	
	@Override
	public boolean equals(Object song) {
		Song other = (Song) song;
		return title.equals(other.getTitle());
	}
	
	@Override
	public int hashCode() {
		return title.hashCode();
	}
}

