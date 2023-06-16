import java.util.*;

/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class Solution {
    public static Node rotate(Node head, int k) {
        // Write your code here. 
        Node temp = head; Node temp2 = head; int count=0; 
        while(temp!=null){
            count++;
            temp = temp.next;
        }  
        if(k % count==0){
            return head;
        }
        k = k%count;
        temp = head; 
        for(int i=1;i<count - k;i++){
            temp2 = temp2.next;
            temp = temp.next;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        Node newHead = null;
        newHead = temp2.next;
        temp2.next = null;
        temp.next = head; 
        return newHead;
    }
}
