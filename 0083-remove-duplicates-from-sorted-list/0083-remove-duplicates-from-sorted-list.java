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
    /*
    Simply using the concept of hashset 
    1. checks for the head node if it is null return null means no node present
    2. Create a empty hashset and all values in it 
    and intialize current node as head node 
    and check that current.next should not be null if found while loop terminates and head is returned
    write a conditon for duplicates elements using .contains() function and checks by iterating throughout the 
    linkedlist 
    and 
	*/
	
	
	if(head==null)
	{
	    return null;
	}
	Set<Integer> duplicates =new HashSet<>();
	duplicates.add(head.val);
	ListNode current= head;
    while (current.next != null) {
        if(duplicates.contains(current.next.val)){
           current.next = current.next.next;
        }
        else {
            duplicates.add(current.next.val);
            current=current.next;
        }
        }
    return head;    
    }
}