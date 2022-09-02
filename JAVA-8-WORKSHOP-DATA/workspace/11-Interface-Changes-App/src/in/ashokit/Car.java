package in.ashokit;

public class Car implements Vehicle {

	@Override
	public void cleanVehicle() {
		System.out.println("Cleaning the vehicle....");
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.cleanVehicle();
		Vehicle.startVehicle();
	}

}