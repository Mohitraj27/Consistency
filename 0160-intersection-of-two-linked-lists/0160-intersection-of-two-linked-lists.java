/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
      private int getListLength(ListNode head) {
    int len = 0;

    while (head != null) {
      len++;
      head = head.next;
    }

    return len;
  }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
       
        
        //This is a Optimized solution Which has O(m+n) time complexity 
        
    // Calculate the length of two linkedlists 
        int lengthA = getListLength(headA);
        int lengthB = getListLength(headB);
        
        
        
        //Comparing both the length if the length of A is greater than B 
        // while loop executes and head node will shift by 1
        while(lengthA > lengthB)
        {
            lengthA--;
            headA=headA.next;
        }
        
        //Again Comparing both the length if the length of B is greater than A 
        // while loop executes and head node will shift by 1 
        // By shifting head node it will reaches to a node at a point where 
        // it will be at the same position node as that of list A
        
        while(lengthB > lengthA)
        {
            lengthB--;
            headB=headB.next;
            
        }
        
        //Now both heads are at same distance for intersection 
        // start moving them until they meet
        while(headA!=headB)
        {
            headA=headA.next;
            headB=headB.next;
        }
        
        
        return headA;
        
    }
}