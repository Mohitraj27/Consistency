//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/
class Solution {
    
    public static Node addOne(Node head) {
        int carry = addOneRecursive(head); // Start the recursion
        if (carry == 1) { // If there's a carry after the recursion, create a new node at the beginning
            Node newNode = new Node(1);
            newNode.next = head;
            head = newNode;
        }
        return head;
    }
    
    public static int addOneRecursive(Node head) {
        if (head == null) return 1; // Base case: end of the linked list
        int carry = addOneRecursive(head.next); // Recursively move to the next node
        int sum = carry + head.data; // Calculate the sum
        head.data = sum % 10; // Update the current node's data
        return sum / 10; // Return the carry
    }
}

