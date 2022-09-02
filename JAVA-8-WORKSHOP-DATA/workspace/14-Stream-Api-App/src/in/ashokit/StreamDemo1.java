package in.ashokit;

import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		stream.forEach(i -> System.out.println(i));
		stream.forEach(System.out::println);
	}

}
