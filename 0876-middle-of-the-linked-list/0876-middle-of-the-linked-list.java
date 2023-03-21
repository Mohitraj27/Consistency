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
    public ListNode middleNode(ListNode head) {
        
        
        /*
        Algorithm Used
        1. We'll take & intitate two pointers (slow & fast to head node)
        2. Slow ptr moves by one node step & fast ptr moves by two step node
        3. When fast ptr points to null & at that when this slow ptr will point to a
        certain node that will be the middle of the linkedlist
        */
        
        ListNode slowPtr=head;
        ListNode fastPtr=head;
        
        //Travel until the fastPtr reaches to null
        while(fastPtr!=null && fastPtr.next!=null )
        {
            
            //slowPtr moves by 1
            slowPtr=slowPtr.next;
            
            //fastPtr moves by 2
            fastPtr=fastPtr.next.next;
            
        }
        
        
        return slowPtr;
    }
}