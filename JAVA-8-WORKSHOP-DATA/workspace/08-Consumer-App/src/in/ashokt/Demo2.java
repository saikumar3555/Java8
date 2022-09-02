package in.ashokt;

import java.util.function.Consumer;

public class Demo2 {

	public static void main(String[] args) {
		Consumer<String> consumer1 = (arg) -> System.out.println(arg + " My Name is Ashok");

		Consumer<String> consumer2 = (arg) -> System.out.println(arg + " I am from India");

		consumer1.andThen(consumer2).accept("Hello, ");
	}

}
