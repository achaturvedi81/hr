/**
 * 
 */
package com.abhishek.test;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/**
 * @author m975852
 *
 */
public class Solution4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		String magazine[] = new String[m];
		for (int magazine_i = 0; magazine_i < m; magazine_i++) {
			magazine[magazine_i] = in.next();
		}
		String ransom[] = new String[n];
		for (int ransom_i = 0; ransom_i < n; ransom_i++) {
			ransom[ransom_i] = in.next();
		}
		in.close();
		System.out.println(canCreateRansomNote(magazine, ransom));
	}

	private static String canCreateRansomNote(String magazine[], String ransom[]) {
		String result = "Yes";
		Map<String, Integer> magazineTable = new Hashtable<String, Integer>();
		for (String word : magazine) {
			if (magazineTable.containsKey(word)) {
				magazineTable.put(word, magazineTable.get(word) + 1);
			} else {
				magazineTable.put(word, 1);	
			}
		}		
		for (String word : ransom) { //iterate all the words in ransom statement
			if(magazineTable.containsKey(word)) {
				if(magazineTable.get(word) > 1 ) {
					magazineTable.put(word, magazineTable.get(word) - 1); //reduce the count if exist more than 1 word
				}else {
					magazineTable.remove(word); //remove the word if exist
				}
			}else {
				result = "No";
			}
		}
		return result;
	}

}
