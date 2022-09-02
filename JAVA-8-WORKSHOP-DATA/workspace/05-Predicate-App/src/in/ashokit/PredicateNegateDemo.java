package in.ashokit;

import java.util.function.Predicate;

public class PredicateNegateDemo {

	public static void main(String[] args) {
		Predicate<Integer> predicate = p -> p > 10;
		System.out.println(predicate.test(12)); // directly checking condition
		System.out.println(predicate.negate().test(5)); // it is checking reverse of condition
	}
}
