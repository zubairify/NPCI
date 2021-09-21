
public class Car {
	private String model;
	private String[] features;
	
	public Car() {
	}

	public Car(String model, String...features) {	// var-args
		this.model = model;
		this.features = features;
	}

	public void specs() {
		System.out.println("Features of " + model);
		for (String f : features) 
			System.out.println(f);
	}
	
	public static void main(String[] args) {
		// Create 2 car objects with parameterised constructor and print features using specs()
		Car alto = new Car("Suzuki Alto", "Power Window", "Power Steering", "AC");
		alto.specs();
		
		Car venue = new Car("Hyundai Venue", "ABS", "Keyless", "Moon Roof", "Cruise Control", "Power Terrain");
		venue.specs();
	}
}
