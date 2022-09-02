package in.ashokit;

public class Demo1 {

	public static void getCricketerName() {
		String[] names = { "Sachin", "Shewag", "Ganguly", "Dravid", "Yuvraj" };

		int n = (int) (Math.random() * 5);

		System.out.println(names[n]);
	}

	public static void main(String[] args) {
		getCricketerName();
		getCricketerName();
		getCricketerName();
		getCricketerName();
		getCricketerName();
	}

}
