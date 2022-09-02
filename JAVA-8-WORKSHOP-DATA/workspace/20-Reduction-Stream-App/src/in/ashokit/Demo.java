package in.ashokit;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();

		list.add(new Employee("Ram", 23, 20000));
		list.add(new Employee("Ashok", 25, 30000));
		list.add(new Employee("Suresh", 33, 25000));
		list.add(new Employee("Charan", 26, 40000));

		/*Stream<Employee> stream = list.stream();
		Stream<Integer> map = stream.map(e -> e.salary);
		Optional<Integer> totalSalary = map.reduce((p, q) -> p + q);

		if (totalSalary.isPresent()) {
			System.out.println(totalSalary.get());
		}*/
		
		int sum = list.stream()
					  .mapToInt(e -> e.salary)
					  .sum();
		
		System.out.println("Total Salary :: " + sum); 

	}

}

class Employee {
	String name;
	int age;
	int salary;

	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

}
