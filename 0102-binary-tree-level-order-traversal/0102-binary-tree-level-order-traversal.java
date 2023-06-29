// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;
// import java.util.Queue;

// class TreeNode {
//     int val;
//     TreeNode left, right;

//     TreeNode(int value) {
//         val = value;
//         left = right = null;
//     }
// }

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                
                if (temp.left != null) {
                    queue.offer(temp.left);
                }
                
                if (temp.right != null) {
                    queue.offer(temp.right);
                }
                
                level.add(temp.val);
            }
            
            result.add(level);
        }
        
        return result;
    }
}
