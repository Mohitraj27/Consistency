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

class GFG {
    
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
    static void printInorder(Node root){
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
	    	Node root = buildTree(s);
	    	
            Solution ob = new Solution();
    		System.out.println(ob.dupSub(root));
            t--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

/* A Binary Tree node

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

// class Solution {
//     int dupSub(Node root) {
//         // code here 
//         if(root==null)
//         {
//             return false;
//         }
//         if(root.left)
//     }
// }import java.util.HashMap;

class Solution {
    private String helper(Node root, Map<String, Integer> map) {
        if (root == null) {
            return "#";
        }
        
        if(root.left==null && root.right==null){
            return Integer.toString(root.data);
        }
        
        String left = helper(root.left, map);
        String right = helper(root.right, map);
        String s  = ","+root.data +"," + left + "," + right+",";

        map.put(s, map.getOrDefault(s, 0) + 1);

        return s;
    }

    public int dupSub(Node root) {
        Map<String, Integer> map = new HashMap<>();

        helper(root, map);
       
       
        for (Map.Entry<String, Integer> i : map.entrySet()) {
            if (i.getValue() >= 2) {
                return 1;
            }
        }

        return 0;
    }
}
