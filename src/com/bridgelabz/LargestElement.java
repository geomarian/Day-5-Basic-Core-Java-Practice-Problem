/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class LargestElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr = new int [] {97, 75, 756};  
        
        int max = arr[0];  
        
        for (int i = 0; i < arr.length; i++) {  
            
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element is: " + max);  
    }  
	

}
