package in.ashokit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo3 {

	public static void main(String[] args) {
		List<User> user = new ArrayList<>();

		user.add(new User("Ram", 10000, "India"));
		user.add(new User("Anil", 20000, "Canada"));
		user.add(new User("Sunil", 30000, "India"));
		user.add(new User("Orlen", 40000, "Japan"));
		user.add(new User("Cathie", 50000, "UK"));
		user.add(new User("Ching Chong", 10000, "China"));

		Map<String, List<User>> collect = user.stream().collect(Collectors.groupingBy(User::getCountry));
		System.out.println(collect);

	}

}

class User {
	String name;
	int salary;
	String country;

	public User(String name, int salary, String country) {
		this.name = name;
		this.salary = salary;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", salary=" + salary + ", country=" + country + "]";
	}

}
