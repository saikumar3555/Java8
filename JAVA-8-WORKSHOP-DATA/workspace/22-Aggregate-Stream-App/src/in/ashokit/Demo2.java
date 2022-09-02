package in.ashokit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("hi");
		list.add("hello");
		list.add("how");
		list.add("are");
		list.add("you?");

		String joinedString1 = list.stream().collect(Collectors.joining());
		System.out.println(joinedString1);

		String joinedString2 = list.stream().collect(Collectors.joining(" "));
		System.out.println(joinedString2);

		String joinedString3 = list.stream().collect(Collectors.joining(" ", "prefix", "suffix"));
		System.out.println(joinedString3);
	}

}
