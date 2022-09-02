package in.ashokit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();

		list.add(new Employee("Ram", 23, 20000));
		list.add(new Employee("Ashok", 25, 30000));
		list.add(new Employee("Suresh", 33, 25000));
		list.add(new Employee("Charan", 26, 40000));
		
		List<String> collect = list.stream()
								   .map(emp -> emp.name)
		                           .collect(Collectors.toList());
		
		System.out.println(collect);

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
