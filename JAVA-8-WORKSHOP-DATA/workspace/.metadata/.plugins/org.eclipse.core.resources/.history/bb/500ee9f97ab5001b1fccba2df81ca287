package in.ashokit;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		
		list.add(new Person("David", 23, "India"));
		list.add(new Person("Joy", 25, "USA"));
		list.add(new Person("Ryan", 50, "Canada"));
		list.add(new Person("Ram", 45, "India"));
		list.add(new Person("Ching", 56, "China"));
		
		/*boolean anyIndian = list.stream().anyMatch(p -> p.country.equals("India"));
		System.out.println("Is there any Indian in the Collection :: "+anyIndian);*/
		
		/*boolean allMatch = list.stream().allMatch(p -> p.country.equals("India"));
		System.out.println("All Persons Are Indians :: " + allMatch);*/
		
		boolean noneMatch = list.stream().noneMatch(p -> p.country.equals("Japan"));
		System.out.println(noneMatch);
		
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

}
