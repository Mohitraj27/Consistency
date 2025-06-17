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
        ListNode slow = head, fast = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

/**
Tortoise Hare Algorithm
Step 1: Initialze two ptrs slow and fast slow to head and fast to head
Step 2: Iterate through the linkedList slow ptr by 1 and fast ptr by two and as the fast ptr reaches to null while loop breaks 
Step 3 As the loop breaks means fast ptr reaches the last Node and that time return the slow ptr that will be the middle of the linkedList

 **/