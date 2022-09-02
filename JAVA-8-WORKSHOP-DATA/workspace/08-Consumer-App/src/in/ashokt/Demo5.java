package in.ashokt;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Demo5 {

	public static List<Patient> getPatientsData() {
		List<Patient> list = new ArrayList<>();
		list.add(new Patient("Raju", 56, 100, 80));
		list.add(new Patient("Ramu", 36, 120, 60));
		list.add(new Patient("Rani", 46, 90, 80));
		return list;
	}

	public static void main(String[] args) {
		Consumer<List<Patient>> consumer = (list) -> {
			list.forEach(patient -> {
				//write db logic to store record into database
				System.out.println("Patient data saved in db....");
			});
		};
		List<Patient> patientsData = getPatientsData();
		consumer.accept(patientsData);
	}

}

class Patient {

	String name;
	int age;
	int bp;
	int sugar;

	public Patient(String name, int age, int bp, int sugar) {
		super();
		this.name = name;
		this.age = age;
		this.bp = bp;
		this.sugar = sugar;
	}

}