package car_dealership;

public class Employee {
	
	public void handleCustomer(Customer cust,Vehicle vehicle,boolean finance) {
		if(finance) {
			double loanAmount = vehicle.getPrice()-cust.getCashOnHand();
			runCreditHistory(cust,loanAmount);
		}else if (vehicle.getPrice() <= cust.getCashOnHand()) {
			processTransaction(cust , vehicle);
		} else {
			System.out.println("Not enough money you have");
		}
	}
	public void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("runCredit is in progress........");
		System.out.println("Loan is credited succesfully for" + loanAmount);
	}
	public void processTransaction(Customer cust , Vehicle vehicle) {
		System.out.println(cust.getName() + " has purchased the car "+ vehicle + "for the price "+ vehicle.getPrice());
	}
}
