/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    /* Algorithm Used
     
     1. We'll take two pointers ahead and behind pointer and iterate through the list using for loop
    Intially we'll points the ahead to head and also behind node to head
    
    2. both pointers traverse throughout the node , if the ahead  pointer is not null 
    
    3. while loop runs and the ahead pointer moves by one node and inside the same loop behind pointer 
    increases by 1 till the position n is reached from where the node is to be deleted
    
    4. this while loop terminates if the ahead node reaches out to null(i.e last node)
    5. and the termination of while loop this behind pointer connects to next of next node 
    (i.e if the position is 2 from last then behind node reaches out to last 3rd node and adress to 
    the next of next node i.e positon node +2)
    6. this for loop traverse each node and is the ahead is founds to be null , i.e head node -> null
    then return the next node of head node and points the head node to next node
    
    */
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        //Two pointer approach or Two passs approach
        ListNode ahead=head;
        ListNode behind=head;
        
        
        for(int i=1;i<=n+1;i++)
        {
            if(ahead==null)
       
                return head.next;
            ahead=ahead.next;
            
            }
    
    while(ahead!=null)
    
    {
        ahead=ahead.next;
        behind=behind.next;
    }
        
        behind.next=behind.next.next;
        return head;
    }
    
    
    
    
}