//Adding a node at first position in linkedlist
import java.util.*;
class Day_163
{
    
    public static void main(String args[])
    {
        LinkedList<String> list=new LinkedList();
        list.add("Name");
        list.add("is ");
        list.add("Mohit");
        System.out.println(list);
        list.addFirst("My");
        System.out.println(list);
        
    }
}
/*
 Scratch Implementation
 Node head;
   //Creating a Node 
    class Node{
        String data;
        String next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(String data)
    { 
        Node newNode=new Node(data);
        if(head == null){
             head= newNode;
            return;
        }
       // newNode.next = head;
        head=newNode;
    }
    
 */
//Algorithm Used 
/* Inserting Node is [c1]
*  if no node exist i.e LL is empty then
*  [c1]
*    ^ Header is at [c1] else
*   [a1]-->[a3]-->[b2]
 *   ^ Header is at [a1] node intially
 *   we've to insert [c1] at 1st position
 *   [c1]-->[a1]-->[a3]-->[b2]
 *     ^  Header is shifted to [c1] from [a1] and [c1] node is connected with [a1] node
 Step 1 First we will check that the head is null or not means LinkedList is empty or not .
 Step 2 If it is empty then we will make the inserting node as a header node 
 Step 2 Else , We will connect the pointer of inserting node to the 1st Node
 Step 3 now we'll shift the header from the 1st Node [a1] to the inserting Node[c1]
 Step 4 Now the nodes is inserted at first position in LinkedList 
 */