package GreatestCommonDivisor;

import java.util.Scanner;

//*********************************************************************************************************
//Assignment 7 Greatest Common Divisor Program         Author: Carlos Fernandez/L30031020
//
//Finds the greatest common divisor of two user entered numbers 
//*********************************************************************************************************

public class GreatestCommonDivisorProgram {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter the 1st number: ");

		int num1 = scan.nextInt();

		System.out.print("Please enter the 2nd number: ");

		int num2 = scan.nextInt();

		int gcd = 1;

		for (int i = 1; i <= num1 && i <= num2; ++i)

		{

			if (num1 % i == 0 && num2 % i == 0)

				gcd = i;

		}

		if (gcd == 1) {

			System.out.println("Error! GCD is 1");

		}

		System.out.printf("GCD of %d and %d is %d", num1, num2, gcd);

	}

}