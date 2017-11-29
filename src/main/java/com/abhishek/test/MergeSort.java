/**
 * 
 */
package com.abhishek.test;

import java.util.Arrays;

/**
 * @author m975852
 *
 */
public class MergeSort {
	
	public static String inputString = "AbhishekChaturvedi is a great person";
	
	public static void main(String args[]) {
		char inputArray[] = inputString.toCharArray();
		System.out.println(inputArray);
//		System.out.println("OUT ::" + Arrays.copyOfRange(inputArray, 0, 0).length);
		if(inputArray != null && inputArray.length != 0) {
			char outputArray[] = mergeSort(inputArray);
			System.out.println(outputArray);
		}
	}
	
	public static char[] mergeSort(char[] inputArray) {
		if(inputArray.length < 2) {
			return inputArray;
		}else {
			int splitIndex = inputArray.length/2;
			char leftArray[] = mergeSort(Arrays.copyOfRange(inputArray, 0, splitIndex)); //processing first half
			char rightArray[] = mergeSort(Arrays.copyOfRange(inputArray, splitIndex, inputArray.length)); //processing second half
			char outputArray[] = merge(leftArray, rightArray);
			return outputArray;
		}
	}

	private static char[] merge(char[] leftArray, char[] rightArray) {
		char outputArray[] = new char[leftArray.length + rightArray.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(k < outputArray.length) {
			if(i < leftArray.length && j < rightArray.length) {
				if(leftArray[i] <= rightArray[j]) {
					outputArray[k] = leftArray[i];
					i++;
				}else {
					outputArray[k] = rightArray[j];
					j++;
				}
			} else if (i < leftArray.length) {
				outputArray[k] = leftArray[i];
				i++;
			} else if (j < rightArray.length) {
				outputArray[k] = rightArray[j];
				j++;
			}
			k++;
		}
		return outputArray;
	}

}
