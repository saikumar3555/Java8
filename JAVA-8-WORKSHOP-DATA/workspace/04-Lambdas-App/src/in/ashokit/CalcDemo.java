package in.ashokit;

public class CalcDemo {

	public static void main(String[] args) {
		Calculator c = (i, j) -> i + j;
		int result = c.add(10, 30);
		System.out.println(result);
	}
}

@FunctionalInterface
interface Calculator {
	public int add(int i, int j);
}