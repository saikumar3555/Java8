package in.ashokit;

public class Demo2 {
	public static void main(String[] args) {
		NumberTestInterface inter = (i) -> i > 10;
		System.out.println(inter.test(12)); // true
		System.out.println(inter.test(5)); // false
	}
}

@FunctionalInterface
interface NumberTestInterface {
	public boolean test(Integer i);
}
