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
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
       
        /*
        This is a recursive approach
        +LR
        +-> root node
        L -> left node
        R -> right node
        1. Traverse the root node
        2. And then left subtree node and then right subtree
        
        */
       List<Integer> ans = new ArrayList<>();
        recur_inorder(root,ans);
        return ans;
    }
    public void recur_inorder(TreeNode root,List<Integer> ans){
        if(root==null){
            return;
        }
        recur_inorder(root.left,ans);
        ans.add(root.val);
        recur_inorder(root.right,ans);
    }
    
    
}