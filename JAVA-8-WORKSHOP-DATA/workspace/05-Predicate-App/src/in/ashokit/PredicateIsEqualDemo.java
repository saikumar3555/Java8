package in.ashokit;

import java.util.function.Predicate;

public class PredicateIsEqualDemo {

	public static void main(String[] args) {
		Predicate<String> predicate = Predicate.isEqual("Ashok");

		System.out.println(predicate.test("Ashok IT"));
	}
}
