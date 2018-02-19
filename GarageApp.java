package NewGaragKarmit;

public class GarageApp {

	public static void main(String[] args) {

		// Create 2 cars, 1 bus and 1 truck.
		
	

		Garage garage = new Garage();
		Owner owner1 = new Owner("Owner1", "0523744955");
		Owner owner2 = new Owner("Owner2", "0523744956");
		Owner owner3 = new Owner("Owner3", "0523744957");

		// Tell the garage to receive the 2 cars
		Car car1 = new Car("Car1111", "10000", "Red", owner1);
		Car car2 = new Car("Car2222", "10000", "Blue", owner2);

		garage.getObjectToFix(car1);
		garage.getObjectToFix(car2);
		// Print the ones who are waiting for a fix
		System.out.println(garage.toString());

		Driver busDriver = new Driver("busDriver", "05233744957", 165456);
		Bus bus1 = new Bus("bus3333", "1111111", "Blue", busDriver, owner3);

		// Tell the garage to receive the bus
		garage.getObjectToFix(bus1);

		// Tell garage to fix Truck
		Truck truck1 = new Truck("Truck4444", "444444", "Blue", busDriver, owner3, "Semitrailer");
		garage.getObjectToFix(truck1);

		// Print the ones who are waiting for a fix
		System.out.println(garage.toString());

		// Fix the cars
		garage.Fix();

		// Print the ones who are waiting for a fix
		System.out.println(garage.toString());

		garage.getObjectToFix(truck1);

		System.out.println(garage.toString());

		garage.Fix();

		System.out.println(garage.toString());

		garage.getObjectToFix(truck1);

		System.out.println(garage.toString());
		garage.getObjectToFix(car1);
		garage.getObjectToFix(car2);

		System.out.println(garage.toString());
	}

}
