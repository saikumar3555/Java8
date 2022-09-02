package in.ashokit;

public interface Vehicle {

	public void cleanVehicle();

	public default void startEngine() {
		System.out.println("Engine is starting.....");
	}

	public static void startVehicle() {
		System.out.println("Vehicle is starting.....");
	}
}
