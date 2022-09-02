package in.ashokit;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static boolean isPersonEligForVote(Person person, Integer minAge, BiPredicate<Person, Integer> biPredicate) {
		return biPredicate.test(person, minAge);
	}

	public static void main(String[] args) {

		Person p = new Person("Alex", 20);

		BiPredicate<Person, Integer> bipredicate = (person, minAge) -> {
			return person.age > minAge;
		};

		Integer minAgeForVote = 18; // read from db

		boolean isEligible = isPersonEligForVote(p, minAgeForVote, bipredicate);

		System.out.println("Is Eligible For Vote ?? :: " + isEligible);

	}
}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}
