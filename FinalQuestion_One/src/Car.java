public class Car extends Vehicle {

	private int NumerOfDoors;
		
	public int getNumerOfDoors() {
		return NumerOfDoors;
	}

	public void setNumerOfDoors(int numerOfDoors) {
		NumerOfDoors = numerOfDoors;
	}

	// Default Constructor
	Car() {
	}

	public Car(Person owner, int numberOfDoors) {
		setNumerOfDoors(numberOfDoors);
	}
	
}