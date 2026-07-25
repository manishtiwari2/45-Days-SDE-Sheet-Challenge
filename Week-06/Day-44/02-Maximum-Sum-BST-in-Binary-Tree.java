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

    int ans = 0;

    public int maxSumBST(TreeNode root) {
        dfs(root);
        return ans;
    }
    private void dfs(TreeNode root) {
        if(root == null) {
            return;
        }
        if(isBST(root, Long.MIN_VALUE, Long.MAX_VALUE)) {
            ans = Math.max(ans, sum(root));
        }
        dfs(root.left);
        dfs(root.right);
    }
    private boolean isBST(TreeNode root, long min, long max) {
        if(root == null) {
            return true;
        }
        if(root.val <= min || root.val >= max) {
            return false;
        }
        return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
    }
    private int sum(TreeNode root) {
        if(root == null) { 
            return 0;
        }
        return root.val + sum(root.left) + sum(root.right);
    }
}

