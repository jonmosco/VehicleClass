public class Truck extends Vehicle {

	private int NumberOfAxles;
	
	public int getNumberOfAxles() {
		return NumberOfAxles;
	}

	public void setNumberOfAxles(int numberOfAxles) {
		NumberOfAxles = numberOfAxles;
	}

	// default constructor
	Truck(Person owner, int numberOfAxles) {
		setNumberOfAxles(numberOfAxles);
	}
	
}