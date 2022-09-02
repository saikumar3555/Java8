package in.ashokit;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(12);
		list.add(8);
		list.add(15);
		list.add(3);

		
		 /* Stream<Integer> stream1 = list.stream(); 
		  Stream<Integer> stream2 = stream1.filter(num -> num > 10);*/
		 

		list.stream().filter(i -> i > 10).forEach(System.out::println);

		System.out.println("-----------------------------------");
		list.forEach(System.out::println);

	}

}
