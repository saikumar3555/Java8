package in.ashokit;

import java.util.function.Predicate;

public class Demo3WithPredicate {

	public static void main(String[] args) {
		Predicate<Integer> p = (i) -> i > 10;
		System.out.println(p.test(11));
		System.out.println(p.test(5));
	}
}
