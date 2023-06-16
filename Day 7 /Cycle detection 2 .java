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
 }

 *****************************************************************/

public class Solution {
    public static Node firstNode(Node head) {
        // Write your code here. 
        if(head == null || head.next == null){
            return null;
        } 
        Node slow = head;
        Node fast = head;
        Node entry = head;
        while(fast != null && fast.next != null){
               
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){                  // L1 = nC - L2
                while(slow!=entry){
                    slow = slow.next;
                    entry = entry.next;
                } 
                return entry;
            }
        } 
        return null; 
    }
}
