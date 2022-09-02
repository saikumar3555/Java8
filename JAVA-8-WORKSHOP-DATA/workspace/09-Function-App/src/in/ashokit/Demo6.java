package in.ashokit;

import java.util.function.BiFunction;

public class Demo6 {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> bifunction = (i, j) -> i + j;
		Integer apply = bifunction.apply(10, 20);
		System.out.println(apply);
	}
}
