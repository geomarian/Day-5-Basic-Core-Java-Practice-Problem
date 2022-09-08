/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class CoinFlip {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tails = 0;
		int heads = 0;
		int count =1; // because in while loop it should start from 1
		
		double random=0.0;
		
		System.out.println("Please enter the number: ");
		Scanner input = new Scanner(System.in);
		int flips = input.nextInt();
		
		// while loop becaus e if we want to flip 10 times. for loop can also be used
		
		//count should not be 0 & this will flip with 10 times
		while(count<=flips) {
			random=Math.random();
			System.out.println(count + " " + random);
			
			if(random<0.5) {
				tails++;
				System.out.println("Tails");
			}
		
		else {
			heads++;
			System.out.println("Heads");
		}
		count++;
		
	}
	System.out.println("Number of Tails = " + tails);
	System.out.println("Number of Heads = " +  heads);
	
	
	double percentHeads = (double)heads/flips*100;
	double percentTails = (double)tails/flips*100;
	
	System.out.println("Percentage of Heads = " + percentHeads + "%");
	System.out.println("Percentage of Tails = " + percentTails + "%");
	
}
}