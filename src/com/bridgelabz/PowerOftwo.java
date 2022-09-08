/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class PowerOftwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter Number :  ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		if (num >= 0 && num < 31) {
			int value = (int) (Math.pow(2, num));
			System.out.println("Power of 2^" + num + " is: " + value);

			int i = 1;
			do {
				
				System.out.println("Power of 2 raise to " + i + " is: " + (Math.pow(2, i)));
				i++;
			} 
			while (i <= num);
		}
		else {
			System.out.println("Please enter number less than 31");
			System.exit(0);
		}

	}
}