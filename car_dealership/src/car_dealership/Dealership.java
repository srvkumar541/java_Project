package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Customer cust1 = new Customer("Tom","gachibowli", 9000);
	Vehicle vehicle = new Vehicle("Honda",10000);
	Employee emp = new Employee();
	cust1.purchaseCar(vehicle, emp, false);

	}

}
