/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class Factors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number : ");
	     int number = sc.nextInt();
	     
	      for(int i = 2; i<=number; i++) {
	         while(number%i == 0) {
	            System.out.println("Prime Factors are: " + i);
	            
	            number = number/i;
	            System.out.println(number);
	         }
	      }
	   }
	
	}


