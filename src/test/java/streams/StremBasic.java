package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;


public class StremBasic {

	@Test
	public void arrayCheck() {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Babu");
		a.add("Keerthana");
		a.add("Mehan");
		a.add("Bashika");
		int count1 = 0;

		for (int i = 0; i < a.size(); i++) {
			String s = a.get(i);
			if (s.endsWith("a")) {
				count1++;
			}
		}
		System.out.println(count1);


		long count = a.stream().filter(s -> s.endsWith("a")).count();
		System.out.println(count);
		long l=Stream.of("Babu","keerthan","Mehan","Bashika").filter(b->{
			b.startsWith("B");
			return true;
		}).count();
		System.out.println(l);
		
		a.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		a.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		a.stream().filter(s->s.startsWith("B")).map(s->s.substring(0,2).toUpperCase()).forEach(s->System.out.println(s));;
		a.stream().sorted().forEach(s->System.out.println(s));
		
		ArrayList<String> b = new ArrayList<String>();
		a.add("Dhana");
		a.add("Eaga");
		
		Stream<String> str = Stream.concat(a.stream(), b.stream());
		boolean flag = str.anyMatch(s->s.contains("Dhana"));
		
		System.out.println(flag);
	}
	@Test
	public void streamToList() {
		List<String>  li = Stream.of("Babu", "Eaga","Eaga", "Mega").filter(s->s.endsWith("a")).map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(li);
		
		List<String>  li1 = Stream.of("Babu", "Eaga","Eaga", "Mega").distinct().sorted()
				.filter(s->s.endsWith("a")).map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(li1);

	}
}
