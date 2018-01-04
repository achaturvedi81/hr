/**
 * 
 */
package com.abhishek.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author m975852
 *
 */
public class FindRunningMedian {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// int n = in.nextInt();
		LinkedList<Integer> a = new LinkedList<>();
		// for(int a_i=0; a_i < n; a_i++){
		// binaryInsert(a, in.nextInt());
		// float median = findMedian(a);
		// System.out.println(median);
		// }
		int input[] = { 12, 4, 5, 3, 8, 7 };
		for (int i : input) {
			binaryInsert(a, i);
			float median = findMedian(a);
			System.out.println(median);
		}
		// in.close();
	}

	private static void binaryInsert(LinkedList<Integer> a, int nextInt) {
		if (a.size() > 1) {
			int pivot = a.size() / 2;
			while (true) {
				if (nextInt <= a.get(pivot)) {
					if (pivot == 0) {
						a.add(pivot, nextInt);
						break;
					} else {
						pivot = pivot / 2;
					}
				} else if (nextInt > a.get(pivot)) {
					if (pivot == a.size() - 1) {
						a.add(pivot + 1, nextInt);
						break;
					} else
						pivot += pivot / 2;
				}
			}
			
			
			
			System.out.println("Pivot" + pivot);
		} else {
			if (a.size() == 0 || nextInt <= a.get(0)) {
				a.addFirst(nextInt);
			} else {
				a.addLast(nextInt);
			}
		}
	}

	private static float findMedian(LinkedList<Integer> a) {
		float median = 0;
		if (a.size() % 2 == 0) { // even
			if (a.size() != 2) {
				median = (a.get(a.size() / 2) + a.get(a.size() / 2 - 1)) / 2;
			} else {
				median = (a.get(0) + a.get(1)) / 2;
			}
		} else { // odd
			if (a.size() != 1) {
				median = a.get(a.size() / 2);
			} else {
				median = a.getFirst();
			}
		}
		return median;
	}
}
