package Policies;

import java.util.ArrayList;

public class MLMS extends Policy	{

	public MLMS(int serversAmount, ArrayList<ArrayList<Integer>> customers) {
		super(serversAmount, serversAmount, customers);
	}

}
