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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
  //Algorithm Used
        /*
        1. First Create a ListNode & intialize it's value with 0
        2. create one pointr node and assign this new node to it
        3. intitialze carry variable to 0
        4. run a while loop with condition either of the list should not be empty
        5. Check for both the linked lists such that each elements should be added to it
        6. For a digit greater than 10 take a single no. for carry by using Quotoient operator 
        and add the second digit to sum by using % operator, again point the next pointer to sum 
        7. if the carry is 1 then add it to the last digit
        8. return the result node which was created intially at step 1.
        
        */
       // First Create a ListNode & intialize it's value with 0
        ListNode result=new ListNode(0);
        
        //create one pointr node and assign this new node to it
        // intitialze carry variable to 0
        ListNode ptr=result;
        int carry=0;
        
        
      //  run a while loop with condition either of the list should not be empty
        while(l1!=null || l2!=null)
        {
            int sum=0+carry;
            
            //Check for both the linked lists such that each elements should be added to it
            if(l1!=null)
            {
                sum+=l1.val;
                l1=l1.next;
            }
            
            if(l2!=null)
            {
                sum+=l2.val;
                l2=l2.next;
            }
            // For a digit greater than 10 take a single no. for carry by using Quotoient operator 
        // and add the second digit to sum by using % operator, again point the next pointer to sum 
            carry=sum/10;
            sum=sum%10;
            ptr.next=new ListNode(sum);
            ptr=ptr.next;
            }
        // if the carry is 1 then add it to the last digit
        if(carry==1)
            ptr.next=new ListNode(1);
        //  return the result node which was created intially at step 1.
        return result.next;
        
        
    }
}