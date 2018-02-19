package NewGaragKarmit;

public class Bus extends Car {

	private Driver driver;
	

	public Bus(String licensePlateNumber, String speedometer, String color, Driver driver, Owner owner) {
		super(licensePlateNumber, speedometer, color, owner);
		this.driver = driver;

	}
	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}


}
