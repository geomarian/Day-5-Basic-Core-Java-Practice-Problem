package com.bridgelabz;
/**
 * 
 */

/**
 * @author ASUS
 *
 */
public class EvenOrOddNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
	
		
		for(int i=0;i<numbers.length;i++ )
		if(numbers[i]%2!=0) {
			System.out.println("odd number is " + numbers[i]);
		}
		else if (numbers[i]%2==0) {
			System.out.println("even number is " + numbers[i]);

		}
		
	}

}
