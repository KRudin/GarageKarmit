package NewGaragKarmit;

public class Truck extends Bus {
	private String TypeOfCarriage;
	

	public Truck(String licensePlateNumber, String speedometer, String color, Driver driver, Owner owner,
			String TypeOfCarriage) {
		super(licensePlateNumber, speedometer, color, driver, owner);

		this.TypeOfCarriage = TypeOfCarriage;
	}


	public String getTypeOfCarriage() {
		return TypeOfCarriage;
	}


	public void setTypeOfCarriage(String typeOfCarriage) {
		TypeOfCarriage = typeOfCarriage;
	}

}
