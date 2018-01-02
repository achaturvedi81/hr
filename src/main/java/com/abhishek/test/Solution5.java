/**
 * 
 */
package com.abhishek.test;

import java.util.LinkedHashSet;
import java.util.Set;

import com.abhishek.test.helper.ll.Node;

/**
 * @author m975852
 *
 */
public class Solution5 {

	/*
	 * Detect a cycle in a linked list. Note that the head pointer may be 'null' if
	 * the list is empty.
	 * 
	 * A Node is defined as: class Node { int data; Node next; }
	 */

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;

		System.out.println(hasCycle(n1));
	}

	private static boolean hasCycle(Node head) {
		Set<Node> baseSet = new LinkedHashSet<Node>();
		if (head != null) {
			while(head.next != null) {
				baseSet.add(head);
				head = head.next;
				if(baseSet.contains(head)) {
					return true;
				}
			}
			return false;
		} else {
			return false;
		}
	}

}
