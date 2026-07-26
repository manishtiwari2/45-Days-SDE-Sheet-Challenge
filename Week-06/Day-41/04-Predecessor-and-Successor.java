/*
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {

        Node pred = null;
        Node succ = null;
        Node curr = root;

        while (curr != null) {

            if (curr.data == key) {
                if (curr.left != null) {
                    Node temp = curr.left;
                    while (temp.right != null) {
                        temp = temp.right;
                    }
                    pred = temp;
                }
                if (curr.right != null) {
                    Node temp = curr.right;
                    while (temp.left != null) {
                        temp = temp.left;
                    }
                    succ = temp;
                }

                break;
            }

            if (key < curr.data) {
                succ = curr;          // current node can be successor
                curr = curr.left;
            } else {
                pred = curr;          // current node can be predecessor
                curr = curr.right;
            }
        }

        ArrayList<Node> ans = new ArrayList<>();
        ans.add(pred);
        ans.add(succ);

        return ans;
    }
}