package car_dealership;

public class Vehicle {
	private String make;
	private double price;
	
	public Vehicle(String make, double price) {
		super();
		this.make = make;
		this.price = price;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", price=" + price + "]";
	}
	
	
}
