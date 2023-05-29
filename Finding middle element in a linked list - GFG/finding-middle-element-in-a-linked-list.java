//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution g = new Solution();
            int ans = g.getMiddle(head);
            System.out.println(ans);
            //printList(head); 
            t--;
        }
    } 
} 
   
// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution
{
    int getMiddle(Node head)
    {
         /* Algorithm Used
         1. We'll take & intitate two pointers (slow & fast to head node)
        2. Slow ptr moves by one node step & fast ptr moves by two step node
        3. When fast ptr points to null & at that when this slow ptr will point to a
        certain node that will be the middle of the linkedlist.
        Time : o(n) space: o(1)
        */
            Node slowPtr=head,fastPtr=head;
             //Travel until the fastPtr reaches to null
        while(fastPtr!=null && fastPtr.next!=null )
        {
            
            //slowPtr moves by 1
            slowPtr=slowPtr.next;
            
            //fastPtr moves by 2
            fastPtr=fastPtr.next.next;
            
        }
        return slowPtr.data;
            // Your code here.
    }
}
