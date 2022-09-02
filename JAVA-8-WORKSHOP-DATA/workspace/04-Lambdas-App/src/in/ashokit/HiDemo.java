package in.ashokit;

public class HiDemo {

	public static void main(String[] args) {
		MyInterface interf = () -> {
			System.out.println("Hi");
		};
		interf.hi();
	}
}

@FunctionalInterface
interface MyInterface {
	public void hi();
}
