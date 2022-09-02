package in.ashokit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Java");
		names.add("Python");
		names.add("Testing");
		names.add("DevOps");
		names.add("Angular");

		Stream<String> stream = names.stream();
		stream.forEach(System.out::println);
	}

}
