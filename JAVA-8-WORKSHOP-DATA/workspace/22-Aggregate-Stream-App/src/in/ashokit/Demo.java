package in.ashokit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee("Ram", 23, 20000));
		list.add(new Employee("Ashok", 25, 30000));
		list.add(new Employee("Suresh", 33, 25000));
		list.add(new Employee("Charan", 26, 40000));

		Double avgSalary = list.stream().collect(Collectors.averagingInt(emp -> emp.salary));
		System.out.println("Avg Salary For Emp :: "+ avgSalary);

		Optional<Employee> minSalEmp = list.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
		System.out.println("Min Salary :: " + minSalEmp.get());

		Optional<Employee> maxSalEmp = list.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println("Max Salary :: " + maxSalEmp.get());

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}
