public class Car {
	protected String model;
	protected String brand;
	
	public Car(String model, String brand) {
		this.model = model;
		this.brand = brand;
	}
	
	public void startEngine() {
		System.out.println("The engine of your " + brand + " " + model + " has started.");
	}
	
	public void accelerate() {
		System.out.println("You're accelerating your " + brand + " " + model);
	}
	
	public void pushBrakes() {
		System.out.println("You're pushing the brakes on your " + brand + " " + model);
	}
}
