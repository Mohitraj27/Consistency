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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        
        
        
        //Create a sentimental/dummy node to start
        ListNode returnNode=new ListNode(Integer.MIN_VALUE);
        
        //Create a copy of this node to iterate while solving problem
        ListNode headNode = returnNode;
    
    //Traverse till one of the list reaches the end
        while (l1 != null && l2!= null)
        {
            if(l1.val<=l2.val)
            {
                returnNode.next=l1;
                l1=l1.next;
            }
            else {
                returnNode.next=l2;
                l2=l2.next;
            }
            returnNode= returnNode.next;
        }
        
        //Append the remaining list
        if(l1==null)
        {
            returnNode.next=l2;
            
        }
        else if(l2==null)
        {
            returnNode.next=l1;
        }
        
        return headNode.next;
    
    }
}