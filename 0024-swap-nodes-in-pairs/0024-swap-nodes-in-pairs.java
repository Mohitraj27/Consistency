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
    public ListNode swapPairs(ListNode head) {

       // Create a dummy node to ease things  
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode point = dummy;
       
        // Ensure nodes we are swapping are not null
        while(point.next !=null && point.next.next !=null){


            // Identify which nodes to swap
            ListNode swap1 = point.next;
            ListNode swap2 = point.next.next;


            // Actually Swap
            swap1.next = swap2.next;
            swap2.next = swap1;

            // Prepare for next
            point.next = swap2;
            point = swap1;
        }
        // Return the start node
        return dummy.next;
    }
}