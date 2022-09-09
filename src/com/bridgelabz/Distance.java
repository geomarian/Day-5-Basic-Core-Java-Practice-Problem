/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class Distance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Enter X number");
		int x= input.nextInt();

		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter Y number");
		int y= input1.nextInt();
		
		double res = Math.sqrt(x*x+y+y);
		System.out.println("Distance between points is "+ res);
		
	}

}
