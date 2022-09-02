package in.ashokit;

import java.util.function.Function;

public class Demo3 {

	public static void main(String[] args) {
		Function<String, String> function = s -> s.replaceAll(" ", "");
		String formatted = function.apply("Ashok IT (Learn Here.. Lead Anywhere..!!)");
		System.out.println(formatted);
	}
}
