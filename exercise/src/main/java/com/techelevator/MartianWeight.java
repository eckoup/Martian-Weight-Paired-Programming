package com.techelevator;

import java.util.Scanner;

/*
In case you've ever pondered how much you weigh on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

$ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth is 37 lbs. on Mars.
 235 lbs. on Earth is 88 lbs. on Mars.
 185 lbs. on Earth is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double earthWeightOne = 0.0;
		double earthWeightTwo = 0.0;
		double earthWeightThree = 0.0;

		System.out.println("Please enter weight: ");

		earthWeightOne = Double.parseDouble(scanner.next());
		earthWeightTwo = Double.parseDouble(scanner.next());
		earthWeightThree = Double.parseDouble(scanner.next());

		double marsWeightOne = 0.0;
		marsWeightOne = (earthWeightOne * 0.378);
		double marsWeightTwo = 0.0;
		marsWeightTwo = (earthWeightTwo * 0.378);
		double marsWeightThree = 0.0;
		marsWeightThree = (earthWeightThree * 0.378);

		System.out.println(earthWeightOne + " lbs. on Earth, is " + marsWeightOne + " lbs. on Mars.");
		System.out.println(earthWeightTwo + " lbs. on Earth, is " + marsWeightTwo + " lbs. on Mars.");
		System.out.println(earthWeightThree + " lbs. on Earth, is " + marsWeightThree + " lbs. on Mars.");
	}

}
