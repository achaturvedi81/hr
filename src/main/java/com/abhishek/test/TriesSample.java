/**
 * 
 */
package com.abhishek.test;

import com.abhishek.test.helper.trie.Node;

/**
 * @author m975852
 *
 */
public class TriesSample {
	
	private static Node root;
	
	public static void main(String[] args) {
		String inputString = "This is a test string with all the words that need to go in the tries and need to come out";
		
		buildTree(inputString);
		
	}

	private static void buildTree(String inputString) {
		String words[] = inputString.split(" ");
		for (String word : words) {
			char letters[] = word.toCharArray();
			
			for (char letter : letters) {			
				if(root != null) {
					
				}else {
					root = new Node();

				}
			}
		}
	}
	
	
	
	
	
}
