/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        /* Given node = 5 
        First there will be a given node which is to be deleted
         In first line take the value of very next node of the given node i.e take 1 and assign this
        value to the value of given node
        In second line take the value of 9 and place it at the position of 1 and link them using pointer4
        
        
        
        Below code simplifies this meaning
        In simple words place 1 into the position where 5 is placed and place 1 in the position of 9 
        */
        node.val=node.next.val;
        node.next=node.next.next;
        
    }
}