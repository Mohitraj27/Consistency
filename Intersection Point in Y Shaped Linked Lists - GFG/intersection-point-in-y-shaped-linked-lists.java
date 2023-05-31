//{ Driver Code Starts
import java.util.*;


class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d; 
        next = null;
    }
}
	
 class LinkedList_Intersection
{
    Node head = null;  
	Node tail = null;

public void addToTheLast(Node node) 
{

  if (head == null) {
   head = node;
   tail = head;
  } else {
   //Node temp = head;
   //while (temp.next != null)
    //temp = temp.next;

   //temp.next = node;
   tail.next=node;
   tail = node;
  }
}

  /* Function to print linked list */
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
	
	 
 
     /* Driver program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t>0)
         {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			LinkedList_Intersection llist1 = new LinkedList_Intersection();
		    LinkedList_Intersection llist2 = new LinkedList_Intersection();
			LinkedList_Intersection llist3 = new LinkedList_Intersection();
			
				int a1=sc.nextInt();
				Node head1= new Node(a1);
				Node tail1= head1;
				
				for (int i = 1; i < n1; i++) 
				{
					int a = sc.nextInt(); 
					tail1.next = (new Node(a));
					tail1= tail1.next;
				}
			
			
				int b1=sc.nextInt();
				Node head2 = new Node(b1);
				Node tail2 = head2;
				for (int i = 1; i < n2; i++) 
				{
					int b = sc.nextInt();  
					tail2.next = (new Node(b));
					tail2= tail2.next;
				}
				if(n3>0){
				int c1=sc.nextInt();
				Node head3= new Node(c1);
				tail1.next = head3;
				tail2.next = head3;
				Node tail3=head3;
				for (int i = 1; i < n3; i++) 
				{
					int c = sc.nextInt();   
					tail3.next = (new Node(c));
					tail3= tail3.next;
				}
				}
				Intersect obj = new Intersect();
				System.out.println(obj.intersectPoint(head1, head2));
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
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
	    
	    
	    /*Optimized Solution
         time - O(n+m) cause we'r traversing 
         space - O(1) i.e no space :)
         step 1 
         Calculate the length of two linkedlists 
          Comparing both the length if the length of A is greater than B 
         while loop executes and head node will shift by 1
        
        //Again Comparing both the length if the length of B is greater than A 
        // while loop executes and head node will shift by 1 
        // By shifting head node it will reaches to a node at a point where 
        // it will be at the same position node as that of list A
         //Now both heads are at same distance for intersection 
        // start moving them until they meet
        
         */
        
         // Check if either linked list is null
         //below is the corner edge test case might fails sometimes
   
    if (head1 == null || head2 == null) {
        return -1; // or any suitable value to indicate no intersection
    }

        
         int len1=getListLength(head1);
         int len2=getListLength(head2);
         
         
         while(len1>len2)
         {
             len1--;
             head1=head1.next;
         }
         while(len2>len1)
         {
             len2--;
             head2=head2.next;
         }
         
         while(head1!=head2 && head1!=null && head2!=null)
         {
             
             head1=head1.next;
             head2=head2.next;
         
             
         }
         
    if (head1 == null || head2 == null) {
        return -1; // or any suitable value to indicate no intersection
    }

        
         return head1.data;
         
	}
	
	// Helper method to calculate the length of a linked list
    private int getListLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

}


