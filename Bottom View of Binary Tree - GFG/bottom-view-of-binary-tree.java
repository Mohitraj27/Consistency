//{ Driver Code Starts
//Initial Template for Java


//Contributed by Sudarshan Sharma
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references
 
    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
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
    
	        while(t-- > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
    	        Solution ob = new Solution();
			    ArrayList <Integer> res = ob.bottomView(root);
			    for (Integer num : res) System.out.print (num + " ");
		     	System.out.println();
	        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null)return ans;
        Map<Integer, Integer> map = new TreeMap<>();
 // map is created to store the horizontal distance (hd) and corresponding node data. 
        Queue<Node> q = new LinkedList<>();
 //to store the nodes of level order traversal
        root.hd = 0;// to initialize the horizontal distance (hd) of the root node.
        q.add(root);//add it to the queue for the BFS traversal.
        while(!q.isEmpty()){
            Node temp = q.remove();//Remove the front node from the queue and assign it to temp.
            int hd = temp.hd;//Get the horizontal distance of temp and store it in hd.
//###########    extra condition for  rest all are same as that of top view of B Tree     ################
            map.put(hd,temp.data);//Update the map with the current hd and the data of temp.*/
     // ##################################   
            if(temp.left!=null)
            {
                temp.left.hd = hd-1;
                q.add(temp.left);
            }
// If the left child of temp is not null, set its horizontal distance to hd - 1 and add it to the queue.
            
             if(temp.right!=null)
            {
                temp.right.hd = hd+1;
                q.add(temp.right);
            }
        }
//If the right child of temp is not null, set its horizontal distance to hd + 1 and add it to the queue.
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        ans.add(entry.getValue());
//values (node data) from the map are added to the ans list in the order they appear in the map.
        return ans;
    } }