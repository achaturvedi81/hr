/**
 * 
 */
package com.abhishek.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author m975852
 *
 */
public class TestCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int testNumber = 4;
		List<Integer> roots = new ArrayList<Integer>();
		roots.add(5);
		roots.add(7);
		roots.add(9);
		roots.add(8);
		roots.add(11);
		roots.add(12);
		roots.add(6);
		roots.add(10);
		
		boolean value = roots.parallelStream().filter(n -> n <= testNumber).findAny().isPresent();
		System.out.println("Value " + value);

	}

}
