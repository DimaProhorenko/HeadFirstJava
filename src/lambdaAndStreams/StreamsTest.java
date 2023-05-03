package lambdaAndStreams;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s = List.of("I", "am", "a", "List", "of", "strings");
//		Stream<String> stream = s.stream();
//		Stream<String> limit = stream.limit(4);
//		List<String> result = limit.collect(Collectors.toList());
		
		List<String> result = s.stream()
							  .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
							  .limit(4)
							  .collect(Collectors.toList());
		System.out.println(result);
	}

}
