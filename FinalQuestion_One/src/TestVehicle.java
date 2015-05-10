public class TestVehicle {
	
	public static void main(String[] args) {
		Person a = new Person();
		
		Car carOne = new Car(a, 4);
		
		Truck truckOne = new Truck(a, 2);
		
		//System.out.println("Car one: " + carOne);
		
		Person b = new Person();
		
		truckOne.transferOwnership(b);
		
		MotorCycle cycleOne = new MotorCycle(false);
		
		
	}
	
}