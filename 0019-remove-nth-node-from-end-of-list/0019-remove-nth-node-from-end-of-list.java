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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        if(fast == null){
            return head.next;
        }
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        if(slow != null && slow.next != null){
            slow.next = slow.next.next;
        }
        
        return head;
    }
}

/**
    Step 1: Initalize two ptrs slow and fast to head node
    Step 2: Iterate fast ptrs by 1 and move fast ptrs to 1st index node
    Step 3: Now iterate throghout the linkedlist using two ptrs slow by 1 and fast by 1 
            till fast ptrs reaches  to end 
    Step 4: As the fast ptr reaches to end while loop will break and slow ptr should not be null and its next ptr also
    Step 5: Return the head value 
 */