package Main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.regex.Pattern;

import Policies.MLMS;
import Policies.MLMSBLL;
import Policies.MLMSBWT;
import Policies.Policy;
import Policies.SLMS;

public class Main {
	protected static ArrayList<String> dataFiles;
	protected static ArrayList<ArrayList<Integer>> customers;
	
	public static void main(String[] args) throws IOException {
		fileReader();
		Policy smls;
		Policy mlms;
		Policy mlmsbll;
		Policy mlmsbwt;
		System.out.println(dataFiles);

		for(String file : dataFiles) {
			customers = new ArrayList<>();
			dataReader(file);
			sort(customers);
			System.out.println(customers);
			for(int i = 0; i < 3; i++) {
				smls = new SLMS(2*i +1, customers);
			}
			for(int i = 0; i < 3; i++) {
				smls = new MLMS(2*i +1, customers);
			}
			for(int i = 0; i < 3; i++) {
				smls = new MLMSBLL(2*i +1, customers);
			}
			for(int i = 0; i < 3; i++) {
				smls = new MLMSBWT(2*i +1, customers);
			}
			customers.clear();
		}
		
	}
	
	public static void fileReader() {
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader("inputFiles/dataFiles.txt"));
			dataFiles = new ArrayList<>();
			String file;
			while((file = in.readLine()) != null) {
				dataFiles.add(file);
			}
		}
		catch (Exception e){
			System.out.println("Input file not fount.");
		}
	}
	
	public static void dataReader(String file) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("inputFiles/" + file));
		String data;
		while((data = in.readLine()) != null) {
			if(!Pattern.matches("[0-9]+ [0-9]+", data)) {
				PrintWriter out = new PrintWriter("outputFiles/" + file.substring(0, file.length()-4) + "_OUT.txt", "UTF-8");
				out.println("Input file does not meet the expected format or it is empty.");
				out.close();
				customers.clear();
				return;
			}
			else {
				ArrayList<Integer> customer = new ArrayList<>();
				String[] parts = data.split(" ");
				customer.add(Integer.parseInt(parts[0]));
				customer.add(Integer.parseInt(parts[1]));
				customers.add(customer);
			}
		}
		in.close();
	}
	
	public static void sort(ArrayList<ArrayList<Integer>> arr) {
		ArrayList<Integer> temp;
		for(int i = 0; i < arr.size(); i++) {
			for(int j=1; j < (arr.size()-i); j++){
				if(arr.get(j-1).get(0) > arr.get(j).get(0)) {
					temp = arr.get(j-1);
					arr.set(j-1, arr.get(j));
					arr.set(j, temp);
				}
			}
		}	
	}
		


}
