/* Structure of a Binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    
    int count = 0;
    int ans = -1;
    
    public int kthLargest(Node root, int k) {
        if (root == null) {
            return -1;
        }

        kthLargest(root.right, k);

        count++;
        if (count == k) {
            ans = root.data;
            return ans;
        }

        kthLargest(root.left, k);

        return ans;
    }
}