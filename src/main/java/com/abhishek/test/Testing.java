/**
 * 
 */
package com.abhishek.test;

import java.util.Arrays;

/**
 * @author m975852
 *
 */
public class Testing {
	
	public static String input1 = "Abhishek is great";
	public static String input2 = "Kaebhhsi si teagr";
	
	public static void main(String args[]) {
		char array1[] = input1.toLowerCase().toCharArray();
		char array2[] = input2.toLowerCase().toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		System.out.println(Arrays.equals(array1, array2));
	}

}
 