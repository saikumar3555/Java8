package in.ashokit;

import java.util.function.Predicate;

public class PredicateJoining1 {

	public static void main(String[] args) {

		Predicate<User> p1 = (user) -> user.age > 18;

		Predicate<User> p2 = (user) -> !user.isSingle;

		Predicate<User> predicate = p2.and(p1);

		User user = new User(20, "John", true);

		boolean isAllowed = predicate.test(user);

		System.out.println("User is Allowed :: " + isAllowed);
	}

}

class User {

	Integer age;
	String name;
	boolean isSingle;

	public User(Integer age, String name, boolean isSingle) {
		this.age = age;
		this.name = name;
		this.isSingle = isSingle;
	}

}