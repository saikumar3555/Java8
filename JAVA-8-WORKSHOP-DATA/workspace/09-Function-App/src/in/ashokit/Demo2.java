package in.ashokit;

import java.util.function.Function;

public class Demo2 {

	public static void main(String[] args) {
		Function<Integer, Integer> function = i -> i * i;

		Integer output = function.apply(10);
		System.out.println(output);
	}

}
