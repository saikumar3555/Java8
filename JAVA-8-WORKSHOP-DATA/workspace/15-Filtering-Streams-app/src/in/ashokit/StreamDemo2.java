package in.ashokit;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo2 {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();

		persons.add(new Person("Ashok", 28));
		persons.add(new Person("Dharam", 27));
		persons.add(new Person("Sabyasachi", 25));
		persons.add(new Person("Kumar", 35));
		persons.add(new Person("Srinivas", 30));

		// filter person whose age is >=26 and <=30
		persons.stream()
			   .filter(person -> person.age >= 26 && person.age <= 30)
			   .forEach(System.out::println);

	}
}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
