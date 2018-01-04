/**
 * 
 */
package com.abhishek.test;

import java.util.HashSet;

import com.abhishek.test.helper.ll.Node;

/**
 * @author m975852
 *
 */
public class RotateLinkedList {
	public static void main(String[] args) {
		Node head = null;
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n2;
		head = n1;
		printLL(head);
		Node newHead = rotateLL(head);
		printLL(newHead);
	}

	private static void printLL(Node head) {
		HashSet<Node> visited = new HashSet();
		StringBuffer sb = new StringBuffer();
		while(head != null && !visited.contains(head)) {
			visited.add(head);
			sb.append(head.data).append("->");
			head = head.next;
		}
		System.out.println(sb);
	}

	private static Node rotateLL(Node head) {
		HashSet<Node> visited = new HashSet();
		Node parentNode = null;
		if(head != null) {
			while(head != null && !visited.contains(head)) {
				visited.add(head);
				Node nextNode = head.next;
				head.next = parentNode;
				parentNode = head;
				head = nextNode;
			}
		} else {
			System.err.println("Its a null linked list");
		}
		return parentNode;
	}

}
