package in.ashokit;

import java.util.function.Function;

public class Demo4 {

	private static Function<User, String> loginLambdaFunction() {
		Function<User, String> function = (user) -> {
			if (user.uname.equals("admin") && user.pwd.equals("admin123")) {
				return "Login Success";
			} else {
				return "Invalid Credentials";
			}
		};
		return function;
	}

	private static String loginCheck(User user, Function<User, String> function) {
		return function.apply(user);
	}

	public static void main(String[] args) {
		Function<User, String> function = loginLambdaFunction();

		System.out.println(loginCheck(new User("admin", "admin123"), function));
		System.out.println(loginCheck(new User("admin", "admin123"), function));
	}
}

class User {

	String uname;
	String pwd;

	public User(String uname, String pwd) {
		this.uname = uname;
		this.pwd = pwd;
	}

}
