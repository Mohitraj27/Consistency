//{ Driver Code Starts
//Initial Template for Java

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
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
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
	            String[] ab = br.readLine().trim().split(" ");
                int a = Integer.parseInt(ab[0]);
                int b = Integer.parseInt(ab[1]);
    	    	Node root = buildTree(s);
        	    Solution g = new Solution();
			    System.out.println(g.getCount(root,a,b));
                t--;
            
        }
    }
  
}


// } Driver Code Ends


// A Binary Search Tree node

class Solution 
{
    //Function to count number of nodes in BST that lie in the given range.
    int getCount(Node node, int low, int high) 
    {  
        if(node == null) 
            return 0; 
            
        //if data at currentnode is equal to lower and upper range, we return 1.
    	if (node.data == high && node.data == low)
    		return 1;
  
        //if data at current node is within range then we include it in count 
	    //and call function recursively for its left and right children.
        if(node.data >= low && node.data <= high) 
            return 1 + this.getCount(node.left, low, high)+ 
                this.getCount(node.right, low, high); 
                  
        //else if data at current node is smaller than lower range then
	    //we call function recursively only for right child.
        else if(node.data < low) 
            return this.getCount(node.right, low, high); 
          
        //else we call function recursively only for left child.
        else
            return this.getCount(node.left, low, high);      
    } 
}