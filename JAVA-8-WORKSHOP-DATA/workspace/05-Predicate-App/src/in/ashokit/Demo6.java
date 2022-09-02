package in.ashokit;

import java.util.function.Predicate;

public class Demo6 {

	public static boolean isPersonEligForVote(Person person, Predicate<Person> predicate) {
		return predicate.test(person); // Lambda executing here and returning result
	}

	public static void main(String[] args) {

		Person p1 = new Person("Ashok", 16); // data for lambda

		Predicate<Person> predicate = (person) -> person.age > 18; // lambda

		boolean isEligible = isPersonEligForVote(p1, predicate);// calling method

		System.out.println("Person Eligible For Vote:: " + isEligible); // printing result
	}
}

class Person {
	String name;
	Integer age;

	Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

}