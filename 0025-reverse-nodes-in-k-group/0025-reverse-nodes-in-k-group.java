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
    public ListNode reverseKGroup(ListNode head, int k) {
   
        ListNode temp=head;
        for(int i=0;i<k;i++){
            if(temp==null){
                return head;
            }
            temp=temp.next;
        }
        ListNode sp=reverseKGroup(temp,k);
        ListNode prev=null;
        ListNode curr=head;
        for(int i=0;i<k;i++){
            ListNode after =curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        head.next=sp;
        return prev;
        
    }
}