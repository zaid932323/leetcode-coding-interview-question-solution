package com.leetcode.linkedlist;

//Asked By Microsoft
public class SumOddEvenLinkedList {
	// Represents node of the linked list
	static class Node
	{
	    int data;
	    Node next;
	}
	static Node root;
	 
	// Function to insert a node at the
	// end of the linked list
	static void insert(int item)
	{
	    Node ptr = root, temp = new Node();
	    temp.data = item;
	    temp.next = null;
	 
	    if (root == null)
	        root = temp;
	    else
	    {
	        while (ptr.next != null)
	            ptr = ptr.next;
	        ptr.next = temp;
	    }
	}
	 
	// Function to print the sum of even
	// and odd nodes of the linked lists
	static void evenOdd(Node root)
	{
	    int odd = 0, even = 0;
	    Node ptr = root;
	    while (ptr != null)
	    {
	 
	        // If current node's data is even
	        if (ptr.data % 2 == 0)
	            even += ptr.data;
	 
	        // If current node's data is odd
	        else
	            odd += ptr.data;
	 
	        // ptr now points to the next node
	        ptr = ptr.next;
	    }
	 
	    System.out.println("Even Sum = " + even);
	    System.out.println("Odd Sum = " + odd);
	}
	 
	// Driver code
	public static void main(String[] args)
	{
	    // Node* root = NULL;
	    insert( 1);
	    insert( 2);
	    insert( 3);
	    insert( 4);
	    insert(5);
	    insert(6);
	    insert( 7);
	 
	    evenOdd(root);
	}
	}

