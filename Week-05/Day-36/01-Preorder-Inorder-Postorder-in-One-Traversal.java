/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/


class Solution {

    static class Pair {
        TreeNode node;
        int state;

        Pair(TreeNode node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    List<List<Integer>> treeTraversal(TreeNode root) {

        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            ans.add(in);
            ans.add(pre);
            ans.add(post);
            return ans;
        }

        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1));

        while (!st.isEmpty()) {
            Pair curr = st.pop();

            if (curr.state == 1) {
                pre.add(curr.node.data);

                curr.state++;
                st.push(curr);

                if (curr.node.left != null) {
                    st.push(new Pair(curr.node.left, 1));
                }

            } else if (curr.state == 2) {
                in.add(curr.node.data);

                curr.state++;
                st.push(curr);
                if (curr.node.right != null) {
                    st.push(new Pair(curr.node.right, 1));
                }
            } else {
                post.add(curr.node.data);
            }
        }

        ans.add(in);
        ans.add(pre);
        ans.add(post);

        return ans;
    }
}