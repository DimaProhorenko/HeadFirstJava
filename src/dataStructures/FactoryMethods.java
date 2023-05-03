package dataStructures;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class FactoryMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = List.of("Dima", "George", "John", "Walter");
//		Won't work - Set.of doesn't allow duplicates at creation
//		Set<Integer> nums = Set.of(1, 4, 2, 4, 5, 1, 5, 6, 1, 7);
		Map<String, Integer> scores = Map.of("Dima", 100, "Andrew", 10);
		Map<String, Integer> humans = Map.ofEntries(
				Map.entry("Dima", 23),
				Map.entry("James", 32)
				);
		
//		names.add("Joel");
		
		System.out.println(names);
	}

}
