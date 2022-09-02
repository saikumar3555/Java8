package in.ashokit;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo3 {

	public static void main(String[] args) {
		List<Person1> persons = new ArrayList<>();

		persons.add(new Person1("Ashok", 28));
		persons.add(new Person1("Dharam", 27));
		persons.add(new Person1("Sabyasachi", 25));
		persons.add(new Person1("Kumar", 35));
		persons.add(new Person1(null, 27));
		persons.add(new Person1("Srinivas", 30));

		// filter person whose age is >=26 and <=30 & name is not null
		persons.stream()
			   .filter(person -> person.name!=null)
			   .filter(person -> person.age >=26)
			   .filter(person -> person.age <=30)
			   .forEach(System.out::println);

	}
}

class Person1 {
	String name;
	int age;

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
