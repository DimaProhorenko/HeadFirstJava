package dataStructures;
import java.util.Comparator;

public class ArtistCompare implements Comparator<Song> {
	public int compare(Song one, Song two) {
		return one.getArtist().compareTo(two.getArtist());
	}
}
