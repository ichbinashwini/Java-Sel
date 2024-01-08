import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.Assert;

public class StreamsAndLambda {

	public static void main(String[] args) {
		
// filter methods
// concate - to combime two streams / lists
//filter()- always needs terminal operator
		
		ArrayList <String> names = new ArrayList <String>();
		names.add("Pi");
		names.add("Jo");
		names.add("Kim");
		names.add("Jim");
		
		
		
		Long k = names.stream().filter(s->s.startsWith("J")).count();

		System.out.println(k);
		
		
		ArrayList <String> last_names = new ArrayList <String>();
		last_names.add("Pie");
		last_names.add("Jam");
		last_names.add("Sam");
		last_names.add("Jack");
		
		last_names.stream();
		
		Stream<String> all_names = Stream.concat(names.stream(), last_names.stream());
		//all_names.forEach(s->System.out.println(s));
		
		boolean flag = all_names.anyMatch(s->s.equalsIgnoreCase("jam"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
	}

}
