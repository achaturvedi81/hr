/**
 * 
 */
package com.abhishek.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author m975852
 *
 */
public class Solution3 {

	public static int numberNeeded(String first, String second) {
		char[] firstArray = first.toCharArray();
		char[] secondArray = second.toCharArray();
		
		Map<Character, Integer> firstMap = new HashMap<>();
		Map<Character, Integer> secondMap = new HashMap<>();
		Set<Character> charSet = new HashSet<Character>();
		
		for (int i = 0; i < (firstArray.length > secondArray.length ? firstArray.length : secondArray.length); i++) {
			if(i < firstArray.length) {
				charSet.add(firstArray[i]);
				if(firstMap.containsKey(firstArray[i])) {
					firstMap.put(firstArray[i], firstMap.get(firstArray[i]) + 1);
				}else {
					firstMap.put(firstArray[i], 1);
				}
			}
			
			if(i < secondArray.length) {
				charSet.add(secondArray[i]);
				if(secondMap.containsKey(secondArray[i])) {
					secondMap.put(secondArray[i], secondMap.get(secondArray[i]) + 1);
				}else {
					secondMap.put(secondArray[i], 1);
				}
			}
		}
		
		int delta = 0;

		for (Character character : charSet) {
			int diff = 0;
			if(firstMap.containsKey(character) && secondMap.containsKey(character)) {
				diff = Math.abs(firstMap.get(character) - secondMap.get(character));
			}else if (firstMap.containsKey(character)){
				diff = firstMap.get(character);
			}else {
				diff = secondMap.get(character);
			}
			delta += diff;
		}
		
		return delta;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}

}
