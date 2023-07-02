//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.util.HashMap;
import java.io.*;

    class Node
    {
        int data;
        Node left,right;
        Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
    }
		
public class GFG2
{
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    
	public static void inorder(Node root)
	{
	    if(root==null)
	    return;
	    inorder(root.left);
	    System.out.print(root.data);
	    inorder(root.right);
	}
     /* Drier program to test above functions */
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
        	    GFG g = new GFG();
			
			    ArrayList<Integer> res = g.zigZagTraversal(root) ;
			    for (int i = 0; i < res.size (); i++)
			        System.out.print (res.get (i) + " ");
			    System. out. println();  
    			
                t--;
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java

/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

	    /*
	    Approach for solving the problesm
	    1. Just same as level order traversal but 
	    2. for every alternate level the travsersal will be in reverse order 
	    and for that use stack approach last in first out so that the elements
	    and gets reversed and stored in the array list 
	    
	    lets understood by example 
	    for test case 1 : normal level order traveral will be 1 2 3 4 5 6 7
	    but here it will be in zig zag pattern 
	    so at each alternate level it will be 1 3 2 4 5 6 7 for this we need stack
	    and use of flag variable intially flag is false and when it is  true
	    this stack technique works where it reverse the elements when flag is true and 
	    at next level flag will become false this way all element stored in list 
	    */

class GFG {
    // Function to store the zigzag order traversal of tree in a list.
    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> zigzag = new ArrayList<>();
        if (root == null)
            return zigzag;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;

        while (!queue.isEmpty()) {
            int size = queue.size();
            ArrayList<Integer> level = new ArrayList<>();
            Stack<Integer> reverseStack = new Stack<>();

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();

                // check flag
                if (flag)
                    reverseStack.add(node.data);
                else
                    level.add(node.data);

                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }

            flag = !flag;

            // pop all elements from stack
            while (!reverseStack.isEmpty())
                level.add(reverseStack.pop());

            zigzag.addAll(level);
        }
        return zigzag;
    }
}
