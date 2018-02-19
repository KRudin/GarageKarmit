package NewGaragKarmit;

public class Garage {

	private static final int WAITINGTOFIX = 10;
	private static int currentQueue = 0;
	private Car cars[] = new Car[WAITINGTOFIX];

	public void getObjectToFix(Car objectOfVehicle) {
		// in a case that the car was already fixed once
		if (objectOfVehicle.isFixed()) {
			objectOfVehicle.setFixed(false);
		}
		cars[currentQueue] = objectOfVehicle;
		addCurrentQueue();
	}

	@Override
	public String toString() {
		String msg = currentQueue + " vehicles are waiting to be fixed: \n ";

		for (int i = 0; i < currentQueue; i++) {
			Car vehicle = cars[i];
			//System.out.println(vehicle.getLicensePlateNumber());

			// if the vehicle is not fixed
			if (!vehicle.isFixed()) {
				if (vehicle instanceof Truck) {
					msg = msg + " " + i + ". a Truck thats belong to " + vehicle.getOwner().getName() + " model " +((Truck) vehicle).getTypeOfCarriage() +  "\n ";
					//return msg;
				}
				else if (vehicle instanceof Bus) {
					msg = msg + " " + i + ". a Bus thats belong to " + vehicle.getOwner().getName() + "\n ";
					//return msg;
				}
				else if (vehicle instanceof Car) {
					msg = msg + i + ". a Car thats belong to  " + vehicle.getOwner().getName() + "\n ";
					//return msg;
				}
				
			
				/*
				// System.out.println(vehicle.getClass().equals(Car.class));
				if (vehicle.getClass().equals(Car.class)) {
					msg = msg + i + ". a Car thats belong to " + vehicle.getOwner().getName() + "\n ";
				}
				if (vehicle.getClass().equals(Bus.class)) {
					msg = msg + i + ". a Bus thats belong to " + vehicle.getOwner().getName() + "\n ";
				}
				if (vehicle.getClass().equals(Truck.class)) {
					msg = msg + i + ". a Truck  thats belong to " + vehicle.getOwner().getName() + "\n ";
				}
				
				 * if (vehicle instanceof Car) { msg = msg + i + ". a Car thats belong to " +
				 * vehicle.getOwner().getName() + "\n "; } if (vehicle instanceof Bus) { msg =
				 * msg + " " + i + ". a Bus thats belong to" + vehicle.getOwner().getName() +
				 * "\n "; } if (vehicle instanceof Truck) { msg = msg + " " + i +
				 * ". a Truck thats belong to" + vehicle.getOwner().getName() + "\n "; }
				 */
			}
		}
		return msg;
	}

	public void addCurrentQueue() {
		currentQueue++;
		// System.out.println(currentQueue);

	}

	public void minusCurrentQueue() {
		currentQueue--;
		// System.out.println(currentQueue);
	}

	public void Fix() {
		int temp = currentQueue;
		for (int i = 0; i < temp; i++) {
			Car vehicle = cars[i];
			if (!vehicle.isFixed()) {
				cars[i].setFixed(true);
				cars[i] = null;
				minusCurrentQueue();
			}
		}
	}

}
