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
    public ListNode detectCycle(ListNode head) {
      
        //Similar to LinkedList cycle I
         
        //Using Two pointer approach Also Tortoise Hair Problem
        
        //First Intialize bothe the pointers to head
        ListNode slowPtr=head;
        ListNode fastPtr=head;
        
                //If either of the pointer reaches to null while loop terminates i.e the List is not cycle

        while(fastPtr !=null && fastPtr.next !=null )
        {
            //Slow ptr increment by 1  node whereas fast ptr increment by 2 node
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
     // there will be a node when both the pointer collides at the same this shows that list is cyclic 
           // if not then null will be returned 
            
            if(slowPtr==fastPtr)
    { 
 //As soon as they meet start the head pointer again and move at the same speed
                // while loop taab tak chalega jab tak both head node move kr ke ek ek node slow node tak 
               // nhi pachuch jata hai aur jaise hee pahuche ga while loop gets terminated and slow is returned
                while(head!=slowPtr){
                    head =head.next;
                    slowPtr=slowPtr.next;
                }
                return slowPtr;
            }
            
            }
          //if the list is not cyclic starting wala while loop terminates and false is returned
        return null;
        
    }
}