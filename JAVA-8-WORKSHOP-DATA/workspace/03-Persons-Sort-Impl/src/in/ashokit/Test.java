package in.ashokit;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		persons.add(new Person(23, "John", "USA"));
		persons.add(new Person(24, "Smith", "UK"));
		persons.add(new Person(22, "Ram", "India"));
		persons.add(new Person(20, "Anil", "India"));
		persons.add(new Person(43, "Shoib", "Pakistan"));

		List<Person> sortedList = PersonService.getPersons(persons);
		/*for (Person person : sortedList) {
			System.out.println(person);
		}*/
		
		sortedList.forEach(person -> { System.out.println(person); });
	}

}
