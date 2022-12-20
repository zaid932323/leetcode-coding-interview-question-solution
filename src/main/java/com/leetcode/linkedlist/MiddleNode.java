package com.leetcode.linkedlist;

import com.leetcode.linkedlist.RotateList.ListNode;

// Asked By Microsoft And Amazon
public class MiddleNode {

	  public ListNode middleNode(ListNode head) {
	        ListNode p1 = head;
	        ListNode p2 = head;
	        while (p2 != null && p2.next != null) {
	            p1 = p1.next;
	            p2 = p2.next.next;
	        }
	        return p1;
	    }
	}

