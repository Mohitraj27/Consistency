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
        ListNode slow = head, fast = head;
        while(fast !=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast!=null && fast.equals(slow)){
                return true;
            }
        }
        return false;
    }
}

/**
Tortoise Hare Algorithm
Step 1: Initialze two ptrs slow and fast slow to head and fast to head
Step 2: Iterate through the linkedList slow ptr by 1 and fast ptr by two and where both these ptrs meets return true if not 
Step 3 then it is not a Linked List Cycle return false;

 */