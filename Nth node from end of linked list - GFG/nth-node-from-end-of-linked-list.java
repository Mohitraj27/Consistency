//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d) 
    {
        data = d; 
        next = null;
    }
}
	

	
public class LinkedList_Element_From_Last
{
    Node head;  
	Node tail;
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{

		if (head == null) 
		{
			head = node;
			tail = node;
		} else 
		{
		    tail.next = node;
		    tail = node;
		}
    }
	  
     /* Drier program to test above functions */
    public static void main(String args[])throws IOException
    {
         BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		 int t=Integer.parseInt(in.readLine().trim());
		 
		 while(t>0)
         {
             String s[]=in.readLine().trim().split(" ");
			int n = Integer.parseInt(s[0]);
			int k = Integer.parseInt(s[1]);
			LinkedList_Element_From_Last llist = new LinkedList_Element_From_Last();
			//int n=Integer.parseInt(br.readLine());
			s=in.readLine().trim().split(" ");
			int a1=Integer.parseInt(s[0]);
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = Integer.parseInt(s[i]); 
				llist.addToTheLast(new Node(a));
			}
          
		//System.out.println(llist.head.data);
        Solution g = new Solution(); 
		//System.out.println(k);
		System.out.println(g.getNthFromLast(llist.head,k));
		
			t--;
		}
	}
}


	
	
// } Driver Code Ends


/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution
{
    // space O(1) time O(N)
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
          // Your code here    
     // Taking a count variable c to keep track of the count of node
        int c=0;
        // intialize temp node with head node 
        Node temp=head;
        // Iterate through linkdlist by moving temp node to next node 
        // and increment the count varibel
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        // check if required nth node > count variable means required node doesn't exist
        
        if(n>c) return -1;
        //// if n < c then iterate through linkedlist from beginning using for loop
        // inside loop move current node to next node 
        // after loop current will be pointinv to nth node 
        Node curr=head;
        for(int i=0;i<c-(n+1)+1;i++)
        curr=curr.next;
        
        // return the data of currrent node
        return curr.data;
    	// Your code here	
    }
}
