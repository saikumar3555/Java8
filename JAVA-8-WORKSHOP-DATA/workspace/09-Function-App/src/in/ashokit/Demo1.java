package in.ashokit;

import java.util.function.Function;

public class Demo1 {

	public static void main(String[] args) {
		Function<String, Integer> function = s -> s.length();

		Integer strLength = function.apply("Ashok IT");
		System.out.println(strLength);
	}
}
