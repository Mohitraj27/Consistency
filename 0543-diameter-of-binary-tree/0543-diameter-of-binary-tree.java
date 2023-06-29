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

        /*
        REcursive algo Brute-force approach
        There are three possibilites for getting the diameter of a tree
        1. diamter can exist on left subtree 
        which is maximum distance between two nodes of lhs
        2. diamter can exist on right subtree 
        which is maximum distance between two nodes of rhs
        3. or the max distance between left deepest and right deepest 
        means half of the nodes on left subtree and half on right subtree
        */
 

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        else
        {
            int lh=height(root.left);
            int rh=height(root.right);
            int ldia=diameterOfBinaryTree(root.left);
            int rdia=diameterOfBinaryTree(root.right);
            return Math.max(lh+rh,Math.max(ldia,rdia));
        }
    }
    public int height(TreeNode temp)
    {
        if(temp!=null)
        {
            int lh=height(temp.left);
            int rh=height(temp.right);
            if(lh>rh)
            {
                return lh+1;
            }
            else
            {
                return rh+1;
            }
        }
        else
        {
            return 0;
        }
    }
}
