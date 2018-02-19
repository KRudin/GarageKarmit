package NewGaragKarmit;

public class Driver extends Owner {
	private int licenseNumber;

	public Driver(String name, String phone, int licenseNumber) {
		super(name, phone);
		this.licenseNumber = licenseNumber;
	}

}
