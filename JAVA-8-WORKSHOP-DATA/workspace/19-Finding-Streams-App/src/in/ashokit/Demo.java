package in.ashokit;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();

		list.add(new Person("David", 23, "India"));
		list.add(new Person("Joy", 25, "USA"));
		list.add(new Person("Ryan", 50, "Canada"));
		list.add(new Person("Ram", 45, "India"));
		list.add(new Person("Ching", 56, "China"));

		/*Stream<Person> stream = list.stream();
		Stream<Person> filter = stream.filter(p -> p.country.equals("India"));
		Optional<Person> findFirst = filter.findFirst();
		
		if (findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}
		*/
		
		Optional<Person> findAny = list.stream()
									   .filter(p -> p.country.equals("India"))
									   .findAny();
		if(findAny.isPresent()) {
			System.out.println(findAny.get());
		}
	}

}

class Person {
	String name;
	int age;
	String country;

	public Person(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", country=" + country + "]";
	}
}
