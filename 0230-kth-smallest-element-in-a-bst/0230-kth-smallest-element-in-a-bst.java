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
    // some what similar to code in minimum element  in BST
          public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
         List<Integer> li=new ArrayList();
        dfs(root,li);
         return li.get(k-1);


    }
    static void dfs(TreeNode root,List<Integer> li){
        if(root==null) return;

        dfs(root.left,li);
        li.add(root.val);
        dfs(root.right,li);
    }
}

