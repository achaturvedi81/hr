/**
 * 
 */
package com.abhishek.test;

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
		Node node7 = new Node(8);
		Node node8 = new Node(9);
		node6.left = node7;
		node6.right = node8;
		return rootNode;
	}
	
	private static boolean checkBST(Node root) {
		if(root != null) {
			isBST = true;
			inorderTraverse(root);
		}
        return isBST;
    }
	
	private static Node previousNode = null;
	private static boolean isBST = false;
	
	
	private static void inorderTraverse(Node root) {
		if(isBST) {
			if (root.left != null) {
				inorderTraverse(root.left);
			}

			if (previousNode != null && root.data <= previousNode.data) {
				isBST = false;
			}
			previousNode = root;

			if (root.right != null) {
				inorderTraverse(root.right);
			}
		}
	}
}
