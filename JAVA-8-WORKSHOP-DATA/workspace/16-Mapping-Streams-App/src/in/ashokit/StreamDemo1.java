package in.ashokit;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("kajal");
		list.add("anushka");
		list.add("samantha");
		list.add("alia");
		list.add("pooja");
		
		list.stream()
		    .map(name -> name.toUpperCase())
		    .forEach(System.out::println);

	}

}
