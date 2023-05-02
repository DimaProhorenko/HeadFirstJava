package dataStructures;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.List;

public class JukeBox1 {
	
	public void go() {
		List<Song> songs = MockSongs.getSongsList();
//		System.out.println(songs);
		
//		Sort using comparable
//		Collections.sort(songs);
//		System.out.println(songs);
		
//		Sort using custom Comparators
//		ArtistCompare ac = new ArtistCompare();
//		TitleCompare tc = new TitleCompare();
//		songs.sort(ac);
//		System.out.println("Sorted by an artist\n" + songs);
//		songs.sort(tc);
//		System.out.println("Sorted by a title\n" + songs);
		
//		Sort using lambda instead of the classes that implement Comparator
		
//		songs.sort((one, two) -> two.getArtist().compareTo(one.getArtist()));
//		System.out.println(songs);
//		songs.sort((one, two) -> one.getBpm() - two.getBpm());
//		System.out.println(songs);
		
//		songs.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
		
		
//		Set<Song> songSet = new TreeSet<>(songs);
		
//		You can pass Comparator to TreeSet constructor
		Set<Song> songSet = new TreeSet<>((a, b) -> a.getArtist().compareTo(b.getArtist()));
		songSet.addAll(songs);
		
		System.out.println(songs);
		System.out.println(songSet);
	}
}
