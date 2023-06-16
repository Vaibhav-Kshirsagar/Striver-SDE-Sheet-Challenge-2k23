import java.io.*;
import java.util.* ;

/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
		// Write your code here. 
        if(first == null){
            return second;
        }else if(second == null){
            return first;
        }
        LinkedListNode<Integer> head = new LinkedListNode(0); 
        LinkedListNode<Integer> p = head;
        while(first != null && second != null){
            if(first.data <= second.data){
                 head.next = first;
                 first = first.next;
            }else{
                 head.next = second;
                 second = second.next;
            }  
            head = head.next;
        } 
        while(first != null){
            head.next = first;
            first = first.next;
            head = head.next;
        }
        while(second != null){
            head.next = second;
            second = second.next;
            head = head.next;
        } 
        return p.next;
	}
}
