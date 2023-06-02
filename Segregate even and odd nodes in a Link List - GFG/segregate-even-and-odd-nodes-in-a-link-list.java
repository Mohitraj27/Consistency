//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;

class FastReader{ 
    BufferedReader br; 
    StringTokenizer st; 

    public FastReader(){ 
        br = new BufferedReader(new InputStreamReader(System.in)); 
    } 

    String next(){ 
        while (st == null || !st.hasMoreElements()){ 
            try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
        } 
        return st.nextToken(); 
    } 

    String nextLine(){ 
        String str = ""; 
        try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
        return str; 
    } 
    
    Integer nextInt(){
        return Integer.parseInt(next());
    }
} 

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
class GFG{
	static void printList(Node node, PrintWriter out) 
	{ 
		while (node != null) 
		{ 
			out.print(node.data + " "); 
			node = node.next; 
		} 
		out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution ob = new Solution();
            Node ans = ob.divide(n, head);
            printList(ans, out); 
            t--;
        }
        out.flush();
    } 
} 
// } Driver Code Ends


//User function Template for Java

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

class Solution{
    Node divide(int N, Node head){
        // code here
        
    //case where there is no need to segerrate odd , even nodes in linkdlist
    if(head==null && head.next==null)
    {
    return head;
    }   
    //variables to keep track of the heads and tails of even,odd list evenhead and
    // even tail represnt the starting,ending nodes of even list, oddHead,oddTail
    //represnt starting and ending nodes of odd list
    Node evenHead = null, evenTail = null, oddHead = null, oddTail = null;

    Node temp=head;
    while(temp!=null)
   {
    if((temp.data)%2==0)
    {
         if (evenHead == null) {
            evenHead = temp;
            evenTail = temp;
        } else {
            evenTail.next = temp;
            evenTail = evenTail.next;
        }
    }
    else 
       {
           if (oddHead == null) {
            oddHead = temp;
            oddTail = temp;
        } else {
            oddTail.next = temp;
            oddTail = oddTail.next;
        }
       }
       temp=temp.next;
   }
   if (evenTail != null) {
    evenTail.next = oddHead;
}
if (oddTail != null) {
    oddTail.next = null;
}
if (evenHead != null) {
    return evenHead;
} else {
    return oddHead;
}

}}