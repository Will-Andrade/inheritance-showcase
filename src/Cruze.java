public class Cruze extends Car implements StartCar {
	public Cruze(String model, String brand) {
		super(model, brand);
	}
	
	@Override
	public void start() {
		System.out.println("Pushing button 3 from the remote control...");
		startEngine();
	}
}
