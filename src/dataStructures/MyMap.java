package dataStructures;
import java.util.HashMap;

public class MyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> empIds = new HashMap<>();
		
		empIds.put(1234, "Dima");
		empIds.put(34545, "Jerry");
		empIds.put(54385804, "Tom");
		
		System.out.println(empIds);
		
		empIds.put(1234, "Dimasik@gmail.com");
		
		empIds.putIfAbsent(1234, "Dimaasdf");
		
		System.out.println(empIds.get(1234));
		
		System.out.println(empIds.containsKey(1234));
		System.out.println(empIds.containsValue("Carl"));
		
		
		
	}

}
