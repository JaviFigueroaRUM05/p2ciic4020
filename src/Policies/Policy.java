package Policies;

import java.util.ArrayList;

import Components.Line;
import Components.Server;

public abstract class Policy {
	protected Server[] servers;
	protected Line[] lines;
	protected ArrayList<ArrayList<Integer>> customers;
	
	public Policy(int serversAmount, int linesAmount, 
				  ArrayList<ArrayList<Integer>> customers) {
		this.servers = new Server[serversAmount];
		this.lines = new Line[linesAmount];
		this.customers = customers;
	}
	
	public abstract void runSimulation();
	
}
