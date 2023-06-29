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
    public List<Integer> rightSideView(TreeNode root) {
 
    // this code is of level order traversal of a tree
        // take a array list for storing all right subtree elements
        ArrayList<Integer> result = new ArrayList<>();
        // If root node is null, return the empty result list.
        // corner case 
        if (root == null) {
            return result;
        }
          // now iterating throughout the right view of element using queue
        Queue<TreeNode> queue = new LinkedList<>();
        // adding intial root  element to queue
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.remove();
    // If it is the last node at current level, add its value to the result list.
                if (i == levelSize - 1) {
                    result.add(node.val);
                }

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        return result;
    }
}
