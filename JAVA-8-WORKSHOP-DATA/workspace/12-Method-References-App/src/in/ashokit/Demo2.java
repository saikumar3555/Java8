package in.ashokit;

public class Demo2 {

	public static void m2() {
		System.out.println("Good Evening...!!");
	}

	public static void main(String[] args) {
		MyInterface i1 = () -> {
			System.out.println("Good Evening...!!");
		};
		i1.m1();
		
		MyInterface i2 = Demo2::m2;
		i2.m1();
	}

}

interface MyInterface {
	public void m1();
}
