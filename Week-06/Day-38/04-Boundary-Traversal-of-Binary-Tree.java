/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {

    public ArrayList<Integer> boundaryTraversal(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        // Add root only if it is not a leaf
        if (!isLeaf(root))
            ans.add(root.data);

        addLeftBoundary(root.left, ans);
        addLeaves(root, ans);
        addRightBoundary(root.right, ans);

        return ans;
    }

    private boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

    private void addLeftBoundary(Node node, ArrayList<Integer> ans) {

        while (node != null) {

            if (!isLeaf(node))
                ans.add(node.data);

            if (node.left != null)
                node = node.left;
            else
                node = node.right;
        }
    }

    private void addLeaves(Node node, ArrayList<Integer> ans) {

        if (node == null)
            return;

        if (isLeaf(node)) {
            ans.add(node.data);
            return;
        }

        addLeaves(node.left, ans);
        addLeaves(node.right, ans);
    }

    private void addRightBoundary(Node node, ArrayList<Integer> ans) {

        ArrayList<Integer> temp = new ArrayList<>();

        while (node != null) {

            if (!isLeaf(node))
                temp.add(node.data);

            if (node.right != null)
                node = node.right;
            else
                node = node.left;
        }

        for (int i = temp.size() - 1; i >= 0; i--) {
            ans.add(temp.get(i));
        }
    }
}