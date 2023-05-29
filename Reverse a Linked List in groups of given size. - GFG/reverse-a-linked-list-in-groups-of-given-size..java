//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class ReverseInSize
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail =tail.next;
            }
            
            int k = sc.nextInt();
            Solution ob = new Solution();
            Node res = ob.reverse(head, k);
            printList(res);
            System.out.println();
        }
    }
    
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
}


// } Driver Code Ends


/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {

          public static Node reverse(Node node, int k)
    {
    //same algorithm as that of revrse a linkes list just add a condition for k and 
    // add a count variable whiich is < k 
        if(node==null){
            return null;
        }
        Node p=node; //>>p
        Node q=null; //>>q
        Node r=null; //>>r
        int count=0;
        while(count<k && p!=null){
            q=p.next;
        p.next=r;
            r=p;
            p=q;
            count++;
        }
        if(q!=null){
            node.next=reverse(q,k);
        }
        return r;
    }
}
