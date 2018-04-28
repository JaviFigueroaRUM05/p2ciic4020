package Policies;

import Components.Line;
import Components.Server;

public class Policy {
	protected Server[] servers;
	protected Line[] lines;
	
	public Policy(int serversAmount, int linesAmount) {
		servers = new Server[serversAmount];
		lines = new Line[linesAmount];
	}
	
}
