package com.greatlearning.iitr.fullstacktraining.java.prework;

import java.util.Scanner;

public class PreWorkAssignmentSolution {
	Scanner sc = new Scanner(System.in);

	// function to checkPalindrome

	public void checkPalindrome(int input) {
		System.out.println("The input is :" + input);
		String inputStr= String.valueOf(input);
		String reverseStr= null;
		StringBuffer sb = new StringBuffer();
		if(inputStr != null && !inputStr.isEmpty()) {
			int strLength = inputStr.length();
			for (int j = strLength; j>0;j--) {
				char c = inputStr.charAt(j-1);
				sb.append(c);
				
			}
			reverseStr = sb.toString();
			
		}
		Integer reverseInput = Integer.parseInt(reverseStr);
		if(input == reverseInput) {
			System.out.println("\n");
			System.out.println("The number is a palindrome no");
			System.out.println("\n");
		}else {
			System.out.println("\n");
			System.out.println("The number is not a palindrome number");
			System.out.println("\n");
		}
	}

	// function to printPattern

	public void printPattern(int input) {
		System.out.println("The input is :" + input);
		if (input != 0 && !String.valueOf(input).isEmpty()) {
			System.out.println("\nThe output is as follows:");
			System.out.println("\n");
			for (int i = input; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					System.out.print("*\t");
				}
				System.out.println("\n");
			}

		}
		System.out.println("\n");
	}

	// function to check no is prime or not

	public void checkPrimeNumber(int input) {
		System.out.println("The input is :" + input);
	}

	// function to print Fibonacci Series

	public void printFibonacciSeries(int input) {

		// initialize the first and second value as 0,1 respectively.

		int first = 0, second = 1;
		System.out.println("The input is :" + input);

	}

	// main method which contains switch and do while loop

	public static void main(String[] args) {

		PreWorkAssignmentSolution obj = new PreWorkAssignmentSolution();

		int choice;
		try {

			Scanner sc = new Scanner(System.in);

			do {

				System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

						+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

						+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

				System.out.println();

				choice = sc.nextInt();

				sc = new Scanner(System.in);
				System.out.println("Enter the number");
				int input = sc.nextInt();

				switch (choice) {

				case 0:

					choice = 0;

					break;

				case 1: {

					obj.checkPalindrome(input);

				}

					break;

				case 2: {

					obj.printPattern(input);

				}

					break;

				case 3: {

					obj.checkPrimeNumber(input);

				}

					break;

				case 4: {

					obj.printFibonacciSeries(input);

				}

					break;

				default:

					System.out.println("Invalid choice. Enter a valid no.\n");

				}

			} while (choice != 0);

			System.out.println("Exited Successfully!!!");

			sc.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
