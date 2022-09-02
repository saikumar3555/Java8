package in.ashokt;

import java.util.function.Consumer;

public class Demo1 {

	public static void main(String[] args) {
		Consumer<String> consumer1 = s -> System.out.println(s.toUpperCase());
		consumer1.accept("ashok it");

		Consumer<Integer> consumer2 = i -> System.out.println(i * i);
		consumer2.accept(5);
	}

}
