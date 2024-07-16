class Solution {
    // Helper function to find the path from the root to the given node with value `val`.
    // It appends 'L' to the path if going left and 'R' if going right.
    private boolean find(TreeNode n, int val, StringBuilder sb) {
        // If the current node's value matches the target value, return true.
        if (n.val == val)
            return true;
        
        // Check if the target value is in the left subtree.
        if (n.left != null && find(n.left, val, sb))
            sb.append("L"); // Append 'L' to the path if found in the left subtree.
        // Check if the target value is in the right subtree.
        else if (n.right != null && find(n.right, val, sb))
            sb.append("R"); // Append 'R' to the path if found in the right subtree.
        
        // Return true if any path (left or right) has been found.
        return sb.length() > 0;
    }

    // Function to get directions from the node with value `startValue` to the node with value `destValue`.
    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder s = new StringBuilder(); // Path from root to the start node.
        StringBuilder d = new StringBuilder(); // Path from root to the destination node.

        // Find paths to the start and destination nodes.
        find(root, startValue, s);
        find(root, destValue, d);

        // Find the common path length by comparing paths from the end.
        int i = 0;
        int max_i = Math.min(d.length(), s.length());
        while (i < max_i && s.charAt(s.length() - i - 1) == d.charAt(d.length() - i - 1))
            ++i;

        // The result is a series of 'U' characters (moving up from start node to the common ancestor)
        // followed by the remaining path to the destination node.
        return "U".repeat(s.length() - i) + d.reverse().toString().substring(i);
    }
}