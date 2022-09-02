package in.ashokit;

import java.util.function.Predicate;

public class Demo5 {

	public static void main(String[] args) {
		String[] names = { "Sunny", "Rashmika", "Kajal", "Kareena", "Alia" };

		Predicate<String> p = s -> s.charAt(0) == 'K';

		for (String name : names) {
			if (p.test(name)) {
				System.out.println(name);
			}
		}
	}
}
