package in.ashokit;

public class Demo implements InterfaceA, InterfaceB {

	@Override
	public void m1() {
		// Option-1 : Provide your own implementation for common method in both
		// interfaces
		System.out.println("Hi... i am from Demo m1() method");

		// Use existing implementation from InterfaceA and InterfaceB like
		// below
		InterfaceA.super.m1();
		InterfaceB.super.m1();
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.m1();
	}
}
