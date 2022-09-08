/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class HarmonicNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter number:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		double result = 0.0;
		
		for(int i = num; i > 0; i--) {
			result  = result + (1.0/i);
			System.out.println(" " + result + ", ");
			
		}
	}

}
