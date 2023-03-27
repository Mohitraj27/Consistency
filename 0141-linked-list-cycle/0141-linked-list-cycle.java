/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        // Using the Concept of Warshell Floydd ALgorithm
        //Using Two pointer approach Also Tortoise Hair Problem
        
        
        //First Intialize bothe the pointers to head
        ListNode slowPtr = head;
        ListNode fastPtr= head;
        
        //If either of the pointer reaches to null while loop terminates i.e the List is not cycle
        while(slowPtr!= null && fastPtr!=null && fastPtr.next!=null )
        {
            //Slow ptr increment by 1  node whereas fast ptr increment by 2 node
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
            
            //At a pointer there will be a node when both the pointer  collides at the same node 
            // return true
            if(slowPtr==fastPtr)
            {
                return true;
            }
        }
        //if the list is not cyclic while loop terminates and false is returned
        return false;
        
    }
}