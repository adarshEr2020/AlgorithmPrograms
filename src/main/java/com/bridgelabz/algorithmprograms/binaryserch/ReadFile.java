package com.bridgelabz.algorithmprograms.binaryserch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// class with static function to read file data
public class ReadFile {
	public static ArrayList<String> readFile() {
		ArrayList<String> dataArray = new ArrayList<>();
		String data = " ";
		String filePath = "C:\\Users\\Welcome\\Eclipse workspace\\AlgorithmPrograms\\src\\main\\java\\com\\bridgelabz\\algorithmprograms\\binaryserch\\data.txt";
		
		try {
			File myObj = new File(filePath);
			Scanner myReader = new Scanner(myObj);
			while(myReader.hasNextLine()) {
				data = myReader.nextLine().replaceAll(",",data);
				String[] newData = data.split("\\W+");
				for(String s : newData)
					dataArray.add(s);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return dataArray;
	}
}
