/**
 * 
 */
package com.abhishek.test;

import java.util.Scanner;

/**
 * @author m975852
 *
 */
public class Solution1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
//        System.out.println("n = " + n);
//        System.out.println("k = " + k);
//        for (int i : a) {
//        	System.out.print(i);
//		}
//        System.out.println("\n");
        
        int rotatedArray[] = leftRotate(a, k);
        for (int i : rotatedArray) {
        	System.out.print(i);
		}
        in.close();

	}

	private static int[] leftRotate(int[] a, int k) {
		int trueRotation = k%a.length;
		if(trueRotation == 0){
			return a;
		}else {
			int output[] = new int[a.length];
			for (int i = 0; i < a.length; i++) {
				int newPosition = findNewPosition(i, trueRotation, a.length);
				output[newPosition] = a[i];
			}
			return output;
		}
	}

	private static int findNewPosition(int originalIndex, int rotationValue, int arraySize) {
		int newIndex = originalIndex - rotationValue;
//		System.out.println("newIndex = " + newIndex);
		return newIndex >= 0 ? newIndex : arraySize + newIndex;
	}

}
