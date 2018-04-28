package Components;

import java.util.LinkedList;

public class Line {
	private LinkedList<Customer> line;
	private int expectedWaitingTime;
	
	public Line() {
		line = new LinkedList<>();
	}

	public LinkedList<Customer> getLine() {
		return line;
	}

	public void setLine(LinkedList<Customer> line) {
		this.line = line;
	}

	public int getExpectedWaitingTime() {
		return expectedWaitingTime;
	}

	public void setExpectedWaitingTime(int expectedWaitingTime) {
		this.expectedWaitingTime = expectedWaitingTime;
	}
	
}
