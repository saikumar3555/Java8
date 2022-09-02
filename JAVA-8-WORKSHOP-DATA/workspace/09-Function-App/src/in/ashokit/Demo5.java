package in.ashokit;

import java.util.function.Function;

public class Demo5 {

	public static void main(String[] args) {
		Function<String, String> f1 = s -> s.toUpperCase();
		// System.out.println(f1.apply("ashok it"));

		Function<String, String> f2 = s -> s.substring(0, 5);
		// System.out.println(f2.apply("Ashok IT"));

		String string1 = f1.andThen(f2).apply("ashok it");
		System.out.println(string1);

		String string2 = f1.compose(f2).apply("ashok it");
		System.out.println(string2);
	}

}
