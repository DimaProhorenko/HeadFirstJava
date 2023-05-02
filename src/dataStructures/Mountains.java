package dataStructures;
import java.util.List;
import java.util.ArrayList;

public class Mountains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Mountains().go();
	}
	
	public void go() {
		List<Mountain> mountains = new ArrayList<>();
		mountains.add(new Mountain("Longs", 14255));
		mountains.add(new Mountain("Elbert", 14433));
		mountains.add(new Mountain("Maroon", 14156));
		mountains.add(new Mountain("Castle", 14265));
		System.out.println("as entered:\n" + mountains);
		
		mountains.sort((one, two) -> one.getName().compareTo(two.getName()));
		System.out.println("By name:\n" + mountains);
		
		mountains.sort((one, two) -> two.getHeight() - one.getHeight());
		System.out.println("By height:\n" + mountains);
	}

}


class Mountain {
	private String name;
	private int height;
	
	public Mountain(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHeight() {
		return height;
	}
	
	public String toString() {
		return String.format("%s - %d", name, height);
	}
}
