package in.ashokit;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();

		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Grape");
		fruits.add("Banana");

		for (String name : fruits) {
			System.out.println(name);
		}

		System.out.println("-----------------------------");

		fruits.forEach(f -> System.out.println(f));

		System.out.println("-------------------------");

		fruits.forEach(System.out::println); // using method reference
	}

}
