package in.ashokit;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Demo {

	Map<Integer, Employee> empMap = new HashMap<>();

	/*
	 * public Employee getEmployee(Integer empId) { return empMap.get(empId); }
	 */

	public Optional<Employee> getEmployee(Integer empId) {
		return Optional.ofNullable(empMap.get(empId));
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		/*
		 * Employee employee = d.getEmployee(101);
		 * System.out.println(employee.getName());
		 */

		Optional<Employee> emp = d.getEmployee(101);
		if (emp.isPresent()) {
			System.out.println(emp.get().getName());
		} else {
			System.out.println("No Emp Found");
		}

	}

}

class Employee {

	String name;
	int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

}