public class Palio extends Car implements StartCar {
	public Palio(String model, String brand) {
		super(model, brand);
	}
	
	@Override
	public void start() {
		System.out.println("Putting the key in the ignition, pressing the clutch and " +
				"turning the key...");
		startEngine();
	}
}
