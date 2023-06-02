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


public class LinkedList
{
    
 

    /* Function to print linked list */
   public static void print(Node root)
    {
        Node temp = root;
        while(temp!=null)
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }


    /* Driver program to test above functions */
    public static void main(String args[])
    {

        /* Constructed Linked List is 1.2.3.4.5.6.
         7.8.8.9.null */
        int value;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0 && sc.hasNextInt() )
        {
            int n = sc.nextInt();
            
            //int n=Integer.parseInt(br.readLine());
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;

            for (int i = 1; i < n && sc.hasNextInt() ; i++)
            {
                int a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }


            Node result = new Solution().compute(head);
            print(result);
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node compute(Node head)
    {
        // first checking that the head node should not be null 
        
        if(head == null || head.next==null)
        return head;    // your code here
        
        
        //Set<Integer> result=new HashSet<>();
        // Taking two nodes prev and curr and intialize them to head
    Node prev=head,current=head.next;
    // Iteration of linkedlist occur until current node reached to null i.e last node
    while(current!=null)
    {       // if current node has greater value so update head node data with current 
    //node and next node of head with current node to skip the current node
    // if this conditon becomes false then head node already has a max value checked,
     // in this case current node is last node so else condition work
          if(head.data<current.data){
                head.data=current.data;
                head.next=current.next;
                current=current.next;
            }
            
            else{
                if(current.next==null){
                    head=head.next;
                    current=head;
                }
                current=current.next;
            }



        }
        return prev;

    }
}
  