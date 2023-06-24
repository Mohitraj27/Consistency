/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
        
//     }
// }
class Solution {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case: If both nodes are null, they are considered equal
        if (p == null && q == null)
            return true;
        
        // If one node is null and the other is not, they are not equal
        if (p == null || q == null)
            return false;
        
        // If the values of the current nodes are not equal, they are not equal trees
        if (p.val != q.val)
            return false;
        
        // Recursively check if the left and right subtrees are identical
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
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
        
