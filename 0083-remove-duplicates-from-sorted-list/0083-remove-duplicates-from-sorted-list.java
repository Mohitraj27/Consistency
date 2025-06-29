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
    public ListNode deleteDuplicates(ListNode head) {
       ListNode curr = head;
       while(curr != null && curr.next!=null){
        if(curr.val == curr.next.val){
            curr.next = curr.next.next;
        }else{
            curr = curr.next;
        }
       }
       return head;
    }
    
}

/*
    Create a curre Node and points it to head
    Iterate through each node such that if current node value is equal to next node value
    then assign that next node value to its next node value else incremtn the current node by 1 
    check this until the current node value is null and current next node value is null
 */