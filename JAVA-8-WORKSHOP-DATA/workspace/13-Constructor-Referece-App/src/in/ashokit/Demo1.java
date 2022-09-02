package in.ashokit;

import java.util.function.Supplier;

public class Demo1 {

	public static void main(String[] args) {
		/*Supplier<Sample> i = () -> {
			Sample s = new Sample();
			return s;
		};*/
		
		Supplier<Sample> i = Sample::new; //Constructor Reference

		System.out.println(i.get().hashCode());
		System.out.println(i.get().hashCode());
	}

}

class Sample {
	public Sample() {
		System.out.println("Sample::Constructor");
	}
}