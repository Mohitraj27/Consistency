//{ Driver Code Starts
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
        left = null;
        right = null;
    }
    
    public static Node buildTree(String str)
    {
        // Corner Case
        if(str.length()==0 || str.charAt(0)=='N')
            return null;
        
        // Creating array of Strings from input 
        // String after spliting by space
        String ip[] = str.split(" ");
        
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        
        // Push the root to the queue
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root);
        
        // Starting from the second element
        int i = 1;
        while(queue.size()>0 && i < ip.length)
        {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N"))
            {
                    
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
            if(!currVal.equals("N"))
            {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    
    public static Node inputTree(BufferedReader br) throws IOException
    {
        return buildTree(br.readLine().trim());
    }
    
    public static void inorder(Node root)
    {
        if (root == null)
           return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            Node node1 = Node.inputTree(br);
            
            
            Node node2 = Node.inputTree(br);
            
            Solution obj = new Solution();
            boolean res = obj.areAnagrams(node1, node2);
            
            int _result_val = (res) ? 1 : 0;
            System.out.println(_result_val);
        }
    }
}

// } Driver Code Ends


/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/


class Solution {
    public static boolean areAnagrams(Node root1, Node root2) {
        // Queue to store nodes of both trees
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();
        
        // Add the root nodes of both trees to their respective queues
        q1.add(root1);
        q2.add(root2);
        
        while (!q1.isEmpty() && !q2.isEmpty()) {
            // Check if the sizes of the queues are different, indicating a different number of nodes at the current level
            if (q1.size() != q2.size())
                return false;
            
            // List to store node values at the current level for both trees
            List<Integer> level1 = new ArrayList<>();
            List<Integer> level2 = new ArrayList<>();
            
            // Process nodes at the current level
            int size = q1.size();
            for (int i = 0; i < size; i++) {
                // Get the nodes from both queues
                Node node1 = q1.poll();
                Node node2 = q2.poll();
                
                // Add node values to the lists
                level1.add(node1.data);
                level2.add(node2.data);
                
                // Add left and right child nodes to the queues
                if (node1.left != null)
                    q1.add(node1.left);
                if (node1.right != null)
                    q1.add(node1.right);
                
                if (node2.left != null)
                    q2.add(node2.left);
                if (node2.right != null)
                    q2.add(node2.right);
            }
            
            // Sort the lists and check if they are anagrams
            Collections.sort(level1);
            Collections.sort(level2);
            
            if (!level1.equals(level2))
                return false;
        }
        
        // Check if both queues are empty, indicating all levels have been processed
        return q1.isEmpty() && q2.isEmpty();
    }
}


// class Solution {
//     public static boolean areAnagrams(Node root1, Node root2) {
//         // code here
//         /*
//         time - O(NlogN) space -O(N)
//         taking two separte queue for two separate  trees 
//         */
//         Queue<Node> q1 = new LinkedList<Node>();
//         Queue<Node> q2 = new LinkedList<Node>();
        
//         // pushing the root node of both trees to their queues
//          q1.add(root1); q2.add(root2);
        
//         // now while loop for iterating throughout the tree using queue
//         while(!q1.isEmpty()|| !q2.isEmpty())
//         {
//             // corner case when both the queue size are not equal return false
//             // which means f=either of the queue is empty i.e only one tree is presnt 
//             if(q1.size()!=q2.size()) return false;
           
           
//             // for traversal through each child node of both the trees 
//             ArrayList<Integer> curr_l_1=new ArrayList<>();
//             ArrayList<Integer> curr_l_2=new ArrayList<>();
           
//             // check if first queue is not empty
//             while(!q1.isEmpty()){
                
//                 // create a node and pass the topmost element of the queue to that node
//                 Node node1= q1.peek();
//                 // remove that queue
//                 q1.remove();
//                 //checking child node for first tree if it is not a leaf node means if
//                 // child node is present for that node then push that node to their respective
//                 // queue q1 and q2
//                 if(node1.left!=null)
//                 q1.add(node1.left);
                
//                 if(node1.right!=null)
//                 q1.add(node1.right);                
                
                
//                 // same above for another tree traversal for their child node using second queue
//                 Node node2=q2.peek();
//                 q2.remove();
//                 //checking child node for second tree
//                 if(node2.left!=null)
//                 q2.add(node2.left);
                
//                 if(node2.right!=null)
//                 q2.add(node2.right);    
                
//                 //now add both the data of two tree into sepearte arraylist
//                 curr_l_1.add(node1.data);
//                 curr_l_2.add(node2.data);
                
//             }
            
//             // after iteration is completed for the node and both sort the list
//             // and check wether they are equal or not using equals() function if not found 
//             // equal then return false else while loop terminates and  return true 
//             Collections.sort(curr_l_1);
            
//             Collections.sort(curr_l_2);
            
//             if(!curr_l_1.equals(curr_l_2))
//             return false;
//         }
        
//         // Check if both queues are empty, indicating all levels have been processed
//         return q1.isEmpty() && q2.isEmpty();
//     }
// }
        
