package Components;

public class Server {
	private Customer currentCustomer;
	private int serviceTimeLeft;
	
	public Customer getCurrentCustomer() {
		return currentCustomer;
	}
	public void setCurrentCustomer(Customer currentCustomer) {
		this.currentCustomer = currentCustomer;
	}
	public int getServiceTimeLeft() {
		return serviceTimeLeft;
	}
	public void setServiceTimeLeft(int serviceTimeLeft) {
		this.serviceTimeLeft = serviceTimeLeft;
	}
		
}
