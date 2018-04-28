package Components;

public class Customer {
	private int arrivalTime;
	private int serviceTime;
	
	public Customer(int arrivalTime, int serviceTime) {
		this.arrivalTime = arrivalTime;
		this.serviceTime = serviceTime;
	}

	public int getArrivalTime() { return arrivalTime; }

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getServiceTime() { return serviceTime; }

	public void setServiceTime(int serviceTime) {
		this.serviceTime = serviceTime;
	}
	
}
