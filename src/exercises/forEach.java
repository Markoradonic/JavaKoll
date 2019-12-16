package exercises;
import java.util.List;
import java.util.Arrays;

public class forEach {

	public static void foreachDisplay(String[] args) {
		List<Integer> n = Arrays.asList(4,5,6,7,8);
		
		n.forEach(i -> System.out.println(i));
	}

}
