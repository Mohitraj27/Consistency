//{ Driver Code Starts
//Initial template code for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

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

class GFG
{
    public static void makeLoop(Node head, Node tail, int x){
        if (x == 0) return;
        
        Node curr = head;
        for(int i=1; i<x; i++)
            curr = curr.next;
        
        tail.next = curr;
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t--> 0)
        {
            int n = sc.nextInt();
            
            int num = sc.nextInt();
            Node head = new Node(num);
            Node tail = head;
            
            for(int i=0; i<n-1; i++)
            {
                num = sc.nextInt();
                tail.next = new Node(num);
                tail = tail.next;
            }
            
            int pos = sc.nextInt();
            makeLoop(head, tail, pos);
            
            Solution x = new Solution();
            if( x.detectLoop(head) )
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}

// } Driver Code Ends


//User function template for JAVA

/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/


class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
    
    //Using Two pointer approach Also Tortoise Hair Problem
        
        //First Intialize bothe the pointers to head
        Node slowPtr=head;
        Node fastPtr=head;
        
                //If either of the pointer reaches to null while loop terminates i.e the List is not cycle

        while(fastPtr !=null && fastPtr.next !=null )
        {
            //Slow ptr increment by 1  node whereas fast ptr increment by 2 node
            slowPtr=slowPtr.next;
            fastPtr=fastPtr.next.next;
     // there will be a node when both the pointer collides at the same this shows that list is cyclic 
           // if not then null will be returned 
            
            if(slowPtr==fastPtr)
    { 
 //As soon as they meet start the head pointer again and move at the same speed
                // while loop taab tak chalega jab tak both head node move kr ke ek ek node slow node tak 
               // nhi pachuch jata hai aur jaise hee pahuche ga while loop gets terminated and slow is returned
                while(head!=slowPtr){
                    head =head.next;
                    slowPtr=slowPtr.next;
                }
                return true;
            }
            
            }
          //if the list is not cyclic starting wala while loop terminates and false is returned
        return false;
}}