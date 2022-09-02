package in.ashokit;

import java.util.function.Supplier;

public class Demo2 {
	public static void main(String[] args) {

		String[] names = { "Sachin", "Shewag", "Ganguly", "Dravid", "Yuvraj" };

		Supplier<String> supplier = () -> {
			int n = (int) (Math.random() * 5);
			return names[n];
		};

		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());

	}
}
