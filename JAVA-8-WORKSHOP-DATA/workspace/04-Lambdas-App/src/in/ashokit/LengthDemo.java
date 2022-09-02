package in.ashokit;

public class LengthDemo {

	public static void main(String[] args) {
		LengthInterface interf = s -> s.length();
		Integer length = interf.getLength("Ashok IT");
		System.out.println(length);
	}

}

@FunctionalInterface
interface LengthInterface {
	public Integer getLength(String s);
}
