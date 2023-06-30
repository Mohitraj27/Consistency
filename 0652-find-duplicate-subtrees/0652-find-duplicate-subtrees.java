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
    private String helper(TreeNode root, Map<String, List<TreeNode>> map){
        if(root==null){
            return "";
        }
        String s="("+helper(root.left,map)+root.val+helper(root.right,map)+")";
        if(!map.containsKey(s)){
            map.put(s,new ArrayList<>());
            
        }
        map.get(s).add(root);
        return s;
        
    }
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        
        List<TreeNode> ans=new ArrayList<>();
        
        Map<String,List<TreeNode>> map=new HashMap<>();
        // helper gives the structure of all the nodes presnt with duplicates
    helper(root,map);
        
        //now store all the duplicates in  a list
        for(List<TreeNode> group : map.values()){
          
            if(group.size() > 1){
                ans.add(group.get(0));
            }
        }
        return ans;
    }
}