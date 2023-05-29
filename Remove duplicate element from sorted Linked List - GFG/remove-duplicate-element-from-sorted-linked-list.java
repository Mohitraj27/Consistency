//{ Driver Code Starts
/* package whatever; // don't place package name! */
import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class Remove_Duplicate_From_LL
{
    Node head;  
    Node tail;
	public void addToTheLast(Node node) 
	{
	  if (head == null) 
	  {
	   head = node;
	   tail = node;
	  } 
	  else 
	  {
	   tail.next = node;
	   tail = node;
	  }
	}
      void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	/* Drier program to test above functions */
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
         {
			int n = sc.nextInt();
			Remove_Duplicate_From_LL llist = new Remove_Duplicate_From_LL(); 
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
			
        GfG g = new GfG();
		llist.head = g.removeDuplicates(llist.head);
		llist.printList();
		
        t--;		
        }
    }}
// } Driver Code Ends





class GfG
{
    
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	// Your code here	
	/*
	Algorithm Used
	1. Initialize head node with temp
	2. check through while condition that head node should not  be null else return that head value
	
	3. inside while loop check if the next pointer should not belong to null , and the next data value
	 should be equal to the current data value then duplicates nodes occur so now take this duplicate to next 
	 node and again check with its further node where again while loop will keep on working and terminates when
	 no duplicates found in that case return whatever value is stored in temp.next
	*/
	Node temp = head;
    while (temp != null) {
        while(temp.next != null && temp.next.data == temp.data) {
           temp.next = temp.next.next;
        }
        temp = temp.next;
    }
    return head;
    }
}
