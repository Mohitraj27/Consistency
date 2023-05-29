//{ Driver Code Starts
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

class Is_LinkedList_Palindrom
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
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		 
		while(t>0)
        {
			int n = sc.nextInt();
			//int k = sc.nextInt();
			Is_LinkedList_Palindrom llist = new Is_LinkedList_Palindrom();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
			    tail.next = new Node(a);
			    tail = tail.next;
			}
			
			Solution g = new Solution();
			if(g.isPalindrome(head) == true)
			    System.out.println(1);
		    else
			    System.out.println(0);
			t--;
		}
		
	}
}




// } Driver Code Ends


/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        /* Brute force approach
        1. First we'll check corner edge cases if the node points to null 
         or linkedlist is empty return head
         
        2. take an array list and add all the elements of the linkedlist
        3. now,iterate through the list by taking the two ptrs intialize start ptr to 0 and end
        ptr to l.size()-1
        while starts<end
        4. check if the last value of list is not equal to end value return false;
        5. increment the start ptr by +1 nd end ptr by -1
        6. after iteration of list completes while loop terminates and true is returned.
         
        */
       if(head == null || head.next==null) return true;
       
       List<Integer> l=new ArrayList<>();
       
       
        // now adding all the elemnts to array list
        while(head!=null)
        {
            l.add(head.data);
            head=head.next;
        }
        
        //now itearting throughout the list by taking two ptr start and end 
        int start=0,end=l.size()-1;
        while(start<end)
        {
            if(l.get(start)!=l.get(end)) return false;
        
            start++;
            end--;
        }
        return true;
        
    }    
}

