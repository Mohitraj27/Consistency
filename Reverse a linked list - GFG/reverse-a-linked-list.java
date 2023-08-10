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
        
            Solution ob = new Solution();
            head = ob.reverseList(head);
            printList(head); 
            t--;
        }
    } 
} 
   
// } Driver Code Ends


//function Template for Java

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution
{
     /*
       we'll take three pointer node p,q,r and intialize it to null 
       take a while loop condition and check it should not be equal to null
       now intialize r with q and q with next value of p pointer 
       for next value of q i.e q.next initialze it with r
       after completeion of iteration using while loop , when loop termination if p pointer 
       reaches to null i.e last node of linkedlist , now intialize head with q pointer after 
       termination of file and return q 
       
        
        */

    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        
    
    Node p=head, q=null, r=null;
        while(p!=null)
        {
            r=q;
            q=p;
            p=p.next;
            q.next=r;
        }
				head=q;
        return q;
    }
}
