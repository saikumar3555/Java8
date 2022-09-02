package in.ashokit;

public class Demo1 {

	public boolean test(Integer i) {
		if (i > 10) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		System.out.println(d1.test(6));
		System.out.println(d1.test(17));
	}
}
