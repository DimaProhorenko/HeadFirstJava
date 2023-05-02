package dataStructures;

import java.util.List;
import java.util.ArrayList;


public class MockSongs {
	
	public static List<Song> getSongsList() {
		List<Song> songs = new ArrayList<>();
		songs.add(new Song("somersault", "Dima", 147));
		songs.add(new Song("cassidy", "Jimmy", 120));
		songs.add(new Song("$10", "Newtron", 123));
		songs.add(new Song("havana", "charizard", 234));
		songs.add(new Song("Cassidy", "Jimmy", 120));
		songs.add(new Song("$10", "sdlf", 345));
		songs.add(new Song("50 Ways", "Arth", 500));
		return songs;
	}

}
