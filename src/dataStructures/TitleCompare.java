package dataStructures;
import java.util.Comparator;

public class TitleCompare implements Comparator<Song> {
	public int compare (Song one, Song two) {
		return one.getTitle().compareTo(two.getTitle());
	}
}
