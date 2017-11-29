/**
 * 
 */
package com.abhishek.test;

import java.util.ArrayList;
import java.util.List;

import com.abhishek.test.helper.Node;

/**
 * @author m975852
 *
 */
public class Solution2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node rootNode = buildTree();
//		Node rootNode = null;
		
		System.out.println(checkBST(rootNode));
	}

	private static Node buildTree() {
		Node rootNode = new Node(4);
		Node node1 = new Node(2);
		Node node2 = new Node(6);
		rootNode.left = node1;
		rootNode.right = node2;
		Node node3 = new Node(1);
		Node node4 = new Node(3);
		node1.left = node3;
		node1.right = node4;
		Node node5 = new Node(5);
		Node node6 = new Node(7);
		node2.left = node5;
		node2.right = node6;
//		Node node7 = new Node(8);
//		Node node8 = new Node(9);
//		node6.left = node7;
//		node6.right = node8;
		return rootNode;
	}
	
	private static boolean checkBST(Node root) {
		boolean isBST = false;
		if(root != null) {
			List<Integer> roots = new ArrayList<Integer>();
//			roots.add(root.data);
			isBST = traverseTree(root, true, roots, null);
		}
        return isBST;
    }

	private static boolean traverseTree(Node root, boolean isBST, List<Integer> roots, String side) {
		if(isBST){
			if(root.left != null) {
				if(root.left.data >= root.data || ("RIGHT".equals(side) && roots.parallelStream().filter(n -> n <= root.left.data).findAny().isPresent())) {
					isBST = false;
				}else{
					List<Integer> newRoots = new ArrayList<Integer>();
					newRoots.addAll(roots);
					newRoots.add(root.right.data);
					isBST = traverseTree(root.left, isBST, newRoots, "LEFT");
				}
			}
			
			if(root.right != null) {
				if(root.right.data <= root.data || ("LEFT".equals(side) && roots.parallelStream().filter(n -> n >= root.right.data).findAny().isPresent())) {
					isBST = false;
				}else{
					List<Integer> newRoots = new ArrayList<Integer>();
					newRoots.addAll(roots);
					newRoots.add(root.data);
					isBST = traverseTree(root.right, isBST, newRoots, "RIGHT");
				}
				
			}
		}
		return isBST;
	}
}
