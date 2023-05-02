package dataStructures;

public class Song implements Comparable<Song> {
	private String title;
	private String artist;
	private int bpm;
	
	public Song(String title, String artist, int bpm) {
		this.title = title.substring(0, 1).toUpperCase() + title.substring(1);
		this.artist = artist.substring(0, 1).toUpperCase() + artist.substring(1);
		this.bpm = bpm;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public int getBpm() {
		return bpm;
	}
	
	public String toString() {
		return String.format("%s - %s", title, artist);
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

