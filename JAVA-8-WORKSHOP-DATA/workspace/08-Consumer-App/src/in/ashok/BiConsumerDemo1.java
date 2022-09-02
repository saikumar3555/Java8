package in.ashok;

import java.util.function.BiConsumer;

public class BiConsumerDemo1 {

	public static void main(String[] args) {
		BiConsumer<String, String> bic1 = (s1, s2) -> System.out.println(s1 + s2);
		bic1.accept("Ashok", "IT");

		BiConsumer<Integer, Integer> bic2 = (i1, i2) -> System.out.println(i1 + i2);
		bic2.accept(10, 20);

	}

}
