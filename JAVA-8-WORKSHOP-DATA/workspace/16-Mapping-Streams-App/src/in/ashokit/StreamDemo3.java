package in.ashokit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo3 {

	public static void main(String[] args) {

		List<List<String>> list = new ArrayList<>();

		list.add(Arrays.asList("a", "b", "c"));
		list.add(Arrays.asList("d", "e", "f"));
		list.add(Arrays.asList("g", "h", "i"));
		list.add(Arrays.asList("j", "k", "l"));

		list.stream()
		    .flatMap(s -> s.stream())
		    .filter(x -> "a".equals(x))
		    .forEach(System.out::println);

	}
}
