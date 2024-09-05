public class Main {
	public static void main(String[] args) {
		Cruze myCar = new Cruze("Cruze", "Chevrolet");
		Palio car2 = new Palio("Palio", "Fiat");
		
		myCar.start();
		myCar.accelerate();
		myCar.pushBrakes();
		
		car2.start();
		car2.accelerate();
		car2.pushBrakes();
	}
}
