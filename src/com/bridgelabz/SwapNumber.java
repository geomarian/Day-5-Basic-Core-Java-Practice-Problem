/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class SwapNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double firstNum = 20.36;
		double secondNum = 30.14;
		
		System.out.println("Before Swap: " + firstNum + " and " + secondNum);
		
		double temp = firstNum;
		firstNum=secondNum;
		secondNum=temp;
		
		System.out.println("After Swap: " + firstNum + " and " + secondNum);
	}

}
