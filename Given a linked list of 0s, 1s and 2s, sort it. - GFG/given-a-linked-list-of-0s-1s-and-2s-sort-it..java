//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

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

class Driverclass
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}




// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
 // time - O(n) space - O(1)
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    { 
        //condition to  checks if the linked list is empty or 
    //contains only one node. If so, it returns the head as it is, 
    //since there is nothing to sort.
        if(head==null || head.next==null)
        {
            return head;
        }
        //created three dummy nodes and initalized them with value of 0
        
        Node zeroD = new Node(0); // Dummy node for 0s
        Node oneD = new Node(0);  // Dummy node for 1s
        Node twoD = new Node(0);  // Dummy node for 2s

       // three ptrs are initialzed and set to dummy nodes
        Node zero = zeroD, one = oneD, two = twoD;
        // current node is set to head
        Node curr = head;
 
        // the current node when reaches ti end node then while loop termiates 
        
        while (curr != null) {
            // if current node is 0 then it is added to list and zero ptr moves 
            // forward to next node
            if (curr.data == 0) {
                zero.next = curr;
                zero = zero.next;
            } 
            // current node is 1 then it is added to list and 1ptr moves to next node
            else if (curr.data == 1) {
                one.next = curr;
                one = one.next;
            } else 
            //similar with twp ptr node
            {
                two.next = curr;
                two = two.next;
            }
            curr = curr.next;
        }
// after iteration through all nodes sublist for 0s ,1s, and 2s r formed, now next pts of dummy nodes
// are adjusted to comcenatenate these sublist
        zero.next = (oneD.next != null) ? oneD.next : twoD.next;
        one.next = twoD.next;
        two.next = null;

        return zeroD.next;
        // add your code here
    }
}


