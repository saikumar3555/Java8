package in.ashokit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Demo4 {

	public static void main(String[] args) {

		Predicate<Collection<String>> p = c -> c.isEmpty();

		ArrayList<String> list = new ArrayList<>();
		list.add("A");

		System.out.println(p.test(list));
	}

}
