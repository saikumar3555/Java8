package in.ashokit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Rahul");
		list.add("Sachin");
		list.add("Hardik");
		list.add("Dhoni");

		Map<String, Integer> collect = list.stream()
										 .collect(Collectors.toMap(s -> s, s -> s.length()));
		System.out.println(collect);

	}

}
