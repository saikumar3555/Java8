package in.ashokit;

import java.util.ArrayList;
import java.util.List;

public class SliceDemo1 {

	public static void main(String[] args) {
		List<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("UK");
		countries.add("China");
		countries.add("India");
		countries.add("USA");
		
		/*countries.stream()
		         .distinct()
		         .forEach(System.out::println);*/
		
		/*countries.stream()
		         .limit(3)
		         .forEach(System.out::println);*/
		
		countries.stream()
		         .skip(2)
		         .forEach(System.out::println);
	}

}
