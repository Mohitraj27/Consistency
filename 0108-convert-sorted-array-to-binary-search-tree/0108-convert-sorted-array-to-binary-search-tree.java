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
    int len;
    TreeNode bst(int [] nums,int left,int right){
    if(left>right){
        return null;
    }
    int mid=(right+left)/2;
    TreeNode root=new TreeNode(nums[mid]);

    root.left=bst(nums,left,mid-1);
    root.right=bst(nums,mid+1,right);
    return root;

 }
    public TreeNode sortedArrayToBST(int[] nums) {
        len=nums.length;
        return bst(nums,0,len-1);
    }
}