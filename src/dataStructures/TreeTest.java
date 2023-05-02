package dataStructures;
import java.util.Set;
import java.util.TreeSet;

public class TreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		go();
	}
	
	public static void go() {
		Set<Book> books = new TreeSet<>();
		books.add(new Book("How Cats Work"));
		books.add(new Book("Remix your body"));
		books.add(new Book("Head First Java"));
		
		System.out.println(books);
	}

}

class Book implements Comparable<Book> {
	private String title;
	
	public Book(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int compareTo(Book o) {
		return title.compareTo(o.getTitle());
	}
	
	public String toString() {
		return title;
	}
}
