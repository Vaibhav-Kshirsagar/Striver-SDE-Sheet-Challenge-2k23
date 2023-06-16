import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		// Write your code here! 
		LinkedListNode<Integer> slow = head; LinkedListNode<Integer> fast = head; 
		LinkedListNode<Integer> pre = null;
		LinkedListNode<Integer> nxt = null;
		if(head==null||head.next==null) return true;
		while(fast != null && fast.next != null){
			fast  = fast.next.next;
			slow = slow.next;
		} 
		while(slow != null){
			nxt = slow.next;
			slow.next = pre;
			pre = slow;
			slow = nxt;
		} 
		slow = head;
		while(pre != null){
			if(!slow.data.equals(pre.data)){
				return false;
			} 
			slow = slow.next;
			pre = pre.next;
		} 
		return true;
	}
}
