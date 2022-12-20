package com.leetcode.linkedlist;

//Asked By Microsoft
public class RotateList{
	 public static void main(String[] args) {
         
	        ListNode head = null;
	         
	        ListNode node = new ListNode(5);
	        head = node;        
	        node.next = new ListNode(4);
	        node = node.next;       
	        node.next = new ListNode(10);
	        node = node.next;       
	        node.next = new ListNode(15);
	        node = node.next;       
	        node.next = new ListNode(1);
	         
	        RotateList main = new RotateList();
	        head = main.rotateRight(head, 2);
	         
	        ListNode listNode = head;
	        while(listNode != null) {
	            System.out.print(listNode.value + ", ");
	            listNode = listNode.next;
	        }
	    }
	     
	    /* Solution */
	    public ListNode rotateRight(ListNode head, int k) {
	        if(head != null){
	            ListNode temp = head;
	            int count = 0;
	            while(temp != null){
	                temp = temp.next;
	                count++;
	            }
	 
	            if(k>=count){
	                k = k%count;
	            }
	 
	            if(k > 0){
	                ListNode first = head;
	                ListNode second = head;
	 
	                while(k>0){
	                    second = second.next;
	                    k--;
	                }
	 
	                while(second.next != null){
	                    first = first.next;
	                    second = second.next;
	                }
	 
	                temp = first.next;
	                first.next = null;
	                second.next = head;
	                return temp;            
	            }
	        }
	         
	        return head;
	    }
	     
	    /* Definition of Linked List Node */
	    public static class ListNode {      
	        int value;
	        ListNode next;
	         
	        public ListNode(int value) {
	            this.value = value;
	        }       
	    }
	}