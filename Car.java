package NewGaragKarmit;

public class Car {

	private String licensePlateNumber;
	private String speedometer;
	private String color;
	private Owner owner;
	private boolean isFixed = false;

	public Car(String licensePlateNumber, String speedometer, String color, Owner owner) {
		super();
		this.licensePlateNumber = licensePlateNumber;
		this.speedometer = speedometer;
		this.color = color;
		// this.driver=driver;
		this.owner = owner;
	}

	public String getLicensePlateNumber() {
		return licensePlateNumber;
	}

	public void setLicensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}

	public String getSpeedometer() {
		return speedometer;
	}

	public void setSpeedometer(String speedometer) {
		this.speedometer = speedometer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public boolean isFixed() {
		return isFixed;
	}

	public void setFixed(boolean isFixed) {
		this.isFixed = isFixed;
	}

}
