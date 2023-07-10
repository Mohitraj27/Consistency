//{ Driver Code Starts
//Initial Template for Java

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str)
    {
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
  
	public static void main (String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            int t=Integer.parseInt(br.readLine());
            
            while(t > 0){
                String s = br.readLine();
                Node root = buildTree(s);
                
                int k=Integer.parseInt(br.readLine());
                
                Solution g = new Solution();
                System.out.println (g.kthLargest(root,k));
                t--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution
{
    int i =1;    
    int ans = 0; // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int k)
    {
        int count=countNode(root);
        inorder(root, count-k+1);
        return ans;
        
    }
    
    public static int countNode(Node root){
        if(root==null) return 0;
        
       int left= countNode(root.left);
       int right=countNode(root.right);
       return left+right+1;
    }
    
    public void inorder(Node root, int k) {
        if(root == null) {
            return;
        }
        
        inorder(root.left, k);
        
        if(i==k){
            ans = root.data;   
        }
        i++;       
        inorder(root.right, k);
    }
}

/*

class Solution
{
 //do opposite of inorder   
    int count = 0;
    int ans = 0;
    public int kthLargest(Node root,int K)
    {
        
        if (root == null)
            return ans;
            
        kthLargest(root.right,K);  
        count++;
        if(count==K) 
        return ans=root.data;
        kthLargest(root.left,K);
        

        return ans;
    } */