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
    public boolean isPalindrome(ListNode head) {
        
        /*
        Approach
        1. take two pointer node as l & r and intialize them with head and head.next
        2. Take two lists one list and another reverse list 
        3. travere throughtout the linkedlist using while loop
        4. now add the elements of the list to another list i.e reverse_list 
        5. Take a reverse of reverse_list using Collection framework 
        6. Check is both the lists are equals return true else false
        */
            //Step 1
        ListNode l=head,r=head.next;
        //Step 2 
        List<Integer> list=new ArrayList<>();
        List<Integer> reverse_list=new ArrayList<>();
     
        //Step 3 
        while(head!=null)
        {
            list.add(head.val);
            head=head.next;
        }
        //step 4 (adding all the elements of the linkedlist to the list)
        reverse_list.addAll(list);
        //Step 5
        Collections.reverse(reverse_list);
        
        //step step 6
        if(reverse_list.equals(list)==true) 
        {
            return true;
        }
        return false;
    
        
    }
}