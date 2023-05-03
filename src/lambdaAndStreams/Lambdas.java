package lambdaAndStreams;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Lambdas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 4, 2, 5));
		
		nums.forEach(num -> System.out.println(num));
	}

}
