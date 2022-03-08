package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Double amountTendered = 0.0;
		Double amountDue = 0.0;
		Double changeRequired = 0.0;

		System.out.println("Please enter the amount of the bill: ");
		amountDue = scanner.nextDouble();


		System.out.println("Please enter amount tendered: ");
		amountTendered = scanner.nextDouble();

		changeRequired =  (amountTendered - amountDue);

		System.out.println("Change required is: " + changeRequired);


	}

}
