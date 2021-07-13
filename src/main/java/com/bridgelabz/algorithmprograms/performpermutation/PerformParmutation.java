package com.bridgelabz.algorithmprograms.performpermutation;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Scanner;

public class PerformParmutation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PerformPermutationRecursion pRecursion = new PerformPermutationRecursion();
		PermutationUsingIteration pIteration = new PermutationUsingIteration();

		System.out.print("Enter the string: ");
		String str = input.next();
		input.close();
		int lengthOfString = str.length();
		
		//Permutation using recursion
		ArrayList<String> array = new ArrayList<>();
		array = pRecursion.permute(str, 0, lengthOfString - 1);
		System.out.println("Permutation using Rrcursion:");
		for (int i = 0; i < array.size(); i++)
			System.out.print(array.get(i) + " ");

		System.out.println(" ");

		// Permutation using Iteration
		ArrayList<String> array1 = new ArrayList<>();
		array1 = pIteration.permute(str);
		System.out.println("Permutation using Iteration: ");
		for (int i = 0; i < array1.size(); i++) 
			System.out.print(array1.get(i) + " ");
		
		System.out.println(" ");
//		Collections.sort(array);
//		Collections.sort(array1);
		
		if(array.equals(array1))
			System.out.println("value in both the arraylist is equals");
		else
			System.out.println("value in both the arraylist is equals");
	}
}
