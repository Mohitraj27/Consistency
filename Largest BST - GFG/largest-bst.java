//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the curr node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the curr node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the curr node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            
            Solution T = new Solution();
            System.out.println(T.largestBst(root));
            
            t--;
        }
    }
}


// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

//Take these 4 parameters in every step-(BST(Y/N), Size of Subtree, Min , Max)
//And return the Node with highest Size which is a BST.
// size will be the number of element present ta that subtree 
// min-> left me iterate krte hue minimum ko update krte chalege aur aishe right me iterate 
// krte hue har elements ko update krte rhege
class Solution{
    
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
        Tuple t=largest(root);
        return t.size;
    }
    
    static Tuple largest(Node root)
    {
        if(root==null)
        return new Tuple(0,Integer.MAX_VALUE,Integer.MIN_VALUE);
     
        Tuple left=largest(root.left);
        
        Tuple right=largest(root.right);
        
        if(root.data>left.max && root.data<right.min)
        return new Tuple(left.size+right.size+1,Math.min(root.data,left.min),Math.max(root.data,right.max));
       
        else
        return new Tuple(Math.max(left.size,right.size),Integer.MIN_VALUE,Integer.MAX_VALUE);
        
    }
    
}
class Tuple
{
    int size;
    int min;
    int max;
    Tuple(int size,int min,int max)
    {
        this.size=size;
        this.max=max;
        this.min=min;
    }
}

   
