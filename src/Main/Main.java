package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Main {
	protected static ArrayList<String> dataFiles;
	protected static ArrayList<ArrayList<Integer>> customers;
	
	public static void main(String[] args) {
		fileReader();
		dataReader();
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
	
	public static void dataReader() {
		BufferedReader in;
		try {
			for(String file : dataFiles) {
				in = new BufferedReader(new FileReader("inputFiles/" + file));
				String data;
				while((data = in.readLine()) != null) {
					if(Pattern.matches("[0-9]+ [0-9]+", data)) {
						
					}
					else {
						System.out.println("Input file does not meet the expected format or it is empty.");
					}
				}
			}
		}
		catch (Exception e){
			System.out.println("Input file not fount.");
		}
	}

}
