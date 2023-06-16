import java.io.*;
import java.util.* ;

/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!  
		if(head == null || head.next == null) return head;
		LinkedListNode<Integer> pre = null;
		LinkedListNode<Integer> curr = head;
		LinkedListNode<Integer> nxt= null;
		while(curr != null){
			nxt = curr.next;
			curr.next = pre;
			pre = curr;
			curr = nxt;
		} 
		return pre;
    } 
}
